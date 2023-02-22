package atm;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AtmOperation op = new AtmOperationImpl();
		
		int atmnumber = 12345;
		int atmpin = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to ATM");
		System.out.print("\nEnter ATM number: ");
		int atmNumber = sc.nextInt();
		System.out.print("Enter ATM pin: ");
		int pin = sc.nextInt();
		if((atmnumber == atmNumber) && (atmpin == pin))
		{
			while(true) {
				System.out.println("\n1. Transactions History \n2. Withdraw \n3. Deposit \n4. Transfer  \n5. View balance \n6. Quit");
				System.out.print("\nEnter choice: ");
				int ch = sc.nextInt();
				
				if(ch == 1) {
					op.viewTransactionsHistory();
				}
				else if(ch == 2) {
					System.out.print("Enter amount you want to withdraw: ");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch == 3) {
					System.out.print("Enter amount you want to deposit: ");
					double depositAmount = sc.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch == 4) {
					System.out.print("Enter receiver's account number: ");
					long accNo = sc.nextLong();
					System.out.print("Enter receiver's IFSC code: ");
					String ifscCode = sc.next();
					System.out.print("Enter amount you want to transfer: ");
					double transferAmount = sc.nextDouble();
					op.transfer(transferAmount);
				}
				else if(ch == 5) {
					op.viewBalance();
				}
				else if(ch == 6) {
					System.out.println("Please collect your ATM card");
					System.out.println("Thank you !!");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
				}
			}
		}
		else
		{
			System.out.println("Incorrect ATM number or pin!");
			System.exit(0);
		}

	}

}
