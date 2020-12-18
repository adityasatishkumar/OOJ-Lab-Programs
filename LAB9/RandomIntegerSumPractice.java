import java.util.*;

class ThreadRandom implements Runnable {
	Thread t;
	ThreadRandom() {
		t = new Thread(this,"Random Integer Thread");
		t.start();
	}

	public void run() {
		try {
			Random R = new Random();
			for (int i = 0; i < 10; i++) {
				int n = R.nextInt(20);
				System.out.println("The Random Integer generated is::> " +n);
				
				if((n%2) == 0) {
					new ThreadSqr(n);
				}
				else {
					new ThreadCub(n);
				}
				Thread.sleep(500);
			}	
		}
		catch(InterruptedException e){
			System.out.println("RandomIntegerThread Interrupted");
		}
	}
}

class ThreadSqr implements Runnable {
	int digit;
	Thread s;
	ThreadSqr(int digit) {
		this.digit = digit;
		s = new Thread(this,"Square Thread");
		s.start();
	}

	public void run() {
		System.out.println("Square of "+digit+" = "+(digit*digit));
	}
}
class ThreadCub implements Runnable {
	int digit;
	Thread c;
	ThreadCub(int digit) {
		this.digit = digit;
		c = new Thread(this,"Cube Thread");
		c.start();
	}

	public void run() {
		System.out.println("Cube of "+digit+" = "+(digit*digit*digit));
	}
}

class RandomIntegerSumPractice {
	public static void main(String args[]){
		ThreadRandom R = new ThreadRandom();
		try {
			R.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
	}
}