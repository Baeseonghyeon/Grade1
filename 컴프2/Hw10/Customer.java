package Hw10;

public class Customer {
	private Account[] account;
	private int index;
	private String firstName;
	private String lastName;
	
	
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
		index = 0;
		account = new Account[50];
	}

	public void addAccount(Account acct) {
		account[index] = acct;
		index++;
	}

	public Account getAccount(int index) {
		return account[index];
	}

	public int getNumOfAccounts() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	/*
	 * public SavingsAccount getSavings() { return s_acct; }
	 * 
	 * public CheckingAccount getChecking() { return c_acct; }
	 * 
	 * public void setSavings(SavingsAccount acct) { s_acct = acct; }
	 * 
	 * public void setChecking(CheckingAccount acct) { c_acct = acct; }
	 */
}
