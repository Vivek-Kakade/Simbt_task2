package atm;

public interface AtmOperation {
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewTransactionsHistory();
	public void transfer(double transferAmount);
}
