import java.util.*;
import java.lang.*;

class Odd_Thread extends Thread {
	int odd_num_sum=0;
	Odd_Thread(){
		super("ODD Thread");
		System.out.println("Child Thread::> " +this);
		start();
	}
	public void run(){
		try{
			int i;
			for(i=1;i<=100;i++){
				if(i%2 != 0){
					odd_num_sum = odd_num_sum + i;
					Thread.sleep(0);
				}
			}
		}
		catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("Sum of Odd Numbers from 1 to 100::> "+odd_num_sum);
	}
}

class OddEvenSumPractice {
	public static void main(String args[]){
		int even_num_sum=0;
		new Odd_Thread();
		try{
			int i;
			for(i=1;i<=100;i++){
				if(i%2 == 0){
					even_num_sum = even_num_sum + i;
					Thread.sleep(0);
				}
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Sum of Even Numbers from 1 to 100::> "+even_num_sum);	
	}
}