package atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperation {
	ATM atm = new ATM();
	Map<Double, String> transactions = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available balance is " + atm.getBalance() + " Rs");
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%100 == 0) {
			if(withdrawAmount <= atm.getBalance()) {
				transactions.put(withdrawAmount, " withdrawn");
				System.out.println(withdrawAmount + " Rs withdrawn successfully. Please collect your money.");
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient balance!");
			}
		}
		else {
			System.out.println("Please enter the amount in the multiple of 100");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		transactions.put(depositAmount, " deposited");		
		System.out.println(depositAmount + " Rs deposited successfully");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();
	}

	@Override
	public void viewTransactionsHistory() {
		for(Map.Entry<Double,String> t:transactions.entrySet()) {
			System.out.println(t.getKey()+ "" +t.getValue());
		}
		
	}

	@Override
	public void transfer(double transferAmount) {
		if(transferAmount <= atm.getBalance()) {
			transactions.put(transferAmount, " transferred");
			System.out.println(transferAmount + " Rs transferred successfully");
			atm.setBalance(atm.getBalance() - transferAmount);
			viewBalance();
		}
		else {
			System.out.println("Insufficient balance!");
		}
		
	}

}
