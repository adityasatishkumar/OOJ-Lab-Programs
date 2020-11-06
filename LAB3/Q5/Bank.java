import java.util.*;
import java.lang.*;

class Bank{

	String name, abc;
	int accNo;
	char accType;
	double balance = 0;
	double deposit;
	double chequeAmount;

	Scanner in = new Scanner(System.in);

	void inputData() {

		System.out.println("Enter your account type (Savings/Current):");
		abc = in.nextLine();
		accType = abc.charAt(0);
	}

	void deposit() {

		System.out.println("Enter an amount to deposit: ");
		deposit = in.nextDouble();

		balance += deposit;
		System.out.println("Balance has been updated ");
		System.out.println("");

	}

	void viewBalance(){

		System.out.println("Balance = " + balance);
		System.out.println("");

	}

	public static void main(String[]args){

		Scanner s = new Scanner(System.in);
		int x;
		Bank a1 = new Bank();
		a1.inputData();

		if(a1.accType == 'C' || a1.accType == 'c'){

			Current a2 = new Current();

			do{

				System.out.println("WELCOME TO YOUR CURRENT ACCOUNT");
				System.out.println("");
				System.out.println("(1) Deposit ");
				System.out.println("(2) Check balance ");
				System.out.println("(3) Issue Cheque ");
				System.out.println("(4) Exit");
				System.out.println("Enter your choice: ");
				x = s.nextInt();
				System.out.println("");

				switch(x){

					case 1: a2.deposit();
					break;
					case 2: a2.checkBalance();
					break;
					case 3: a2.issueCheque();
					break;
					case 4: System.exit(0);
					break;
					default: System.out.println("ERROR. INVALID CHOICE.");

				}

			}		
			
			while(x <= 4 && x >= 1);
		
		}
		
		else if (a1.accType == 'S' || a1.accType == 's'){

			Savings a3 = new Savings();

			do{

				System.out.println("WELCOME TO YOUR SAVINGS ACCOUNT");
				System.out.println("(1) Deposit");
				System.out.println("(2) View balance");
				System.out.println("(3) Withdraw ");
				System.out.println("(4) Calculate compound interest ");
				System.out.println("(5) Exit ");
				System.out.println("Enter your choice: ");
				x = s.nextInt();
				System.out.println("");

				switch(x){
		
					case 1: a3.deposit();
					break;
					case 2: a3.viewBalance();
					break;
					case 3: a3.balanceAfterWithdrawal();
					break;
					case 4: a3.computeCI();
					break;
					case 5: System.exit(0);
					break;
					default: System.out.println("ERROR. INVALID CHOICE.");
				
				}

			} 

			while(x <= 5 && x >=1);
		
		}
		
		else System.out.println("INVALID ACCOUNT TYPE");
		
	}

}

class Current extends Bank {

	Current(){

		System.out.println("Enter your name: ");
		name = in.nextLine();
		System.out.println("");


		System.out.println("Enter your account number: ");
		accNo = in.nextInt();
		System.out.println("");

		deposit();
	}

	void issueCheque(){

		System.out.println("Enter amount for which cheque is to be issued.");
		chequeAmount = in.nextDouble();
		System.out.println("");

		if(chequeAmount > balance){
	
			System.out.println("ERROR! Insufficient amount in your account.");

		}
		
		else{
		
			balance -= chequeAmount;
			System.out.println("Cheque has been issued SUCCESSFULLY");
			System.out.println("");
	
		}
	
	}

	void checkBalance(){

		if(balance < 1000){

			System.out.println("Current available balance is lesser than minimum required balance.");
			balance -= 100;
			System.out.println("Service charge of Rs.100 has been deducted from your balance.");
		
		}

		viewBalance();
	
	}

}

class Savings extends Bank{

	double CI, withdrawalAmount, time;

	Savings(){
		
		System.out.println("Enter your name: ");
		name = in.nextLine();
		System.out.println("");

		System.out.println("Enter your account number: ");
		accNo = in.nextInt();
		System.out.println("");

		deposit();
	}

	void computeCI() {

        System.out.println("Enter time period: ");
        time = in.nextInt();
        System.out.println("");

		CI = balance * Math.pow(1 + (0.08 / 12), 12 * time) - balance;
        System.out.println("CI = " + CI);
        balance += CI;
        System.out.println("CI has been deposited");
    }

	void balanceAfterWithdrawal(){

		System.out.println("Enter the amount you want to withdraw: ");
		withdrawalAmount = in.nextDouble();

		if(withdrawalAmount > balance){

			System.out.println("ERROR! The entered amount is greater than the available balance...");
		
		}

		else {

			balance -= withdrawalAmount;
			System.out.println("Amount has been successfully withdrawn!!!!");
		
		}
	}

}