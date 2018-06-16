import java.util.*;

class Bank {
	int numberOfCustomers;
	Customer[] customers;

	public Bank() {
		numberOfCustomers = 0;
		customers = new Customer[10];
	}

	public void addCustomer(Customer c) {
		customers[numberOfCustomers] = c;
		this.numberOfCustomers = numberOfCustomers + 1;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index - 1];
	}
}

class Customer {
	private String firstName;
	private String lastName;
	private int numberOfAccounts;
	BankAccount[] accounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
		numberOfAccounts = 0;
	}

	public String getFirstName() {
		this.firstName = firstName;
		return this.firstName;
	}

	public String getLastName() {
		this.lastName = lastName;
		return this.lastName;
	}

	public void addAccount(BankAccount acc) {
		accounts[numberOfAccounts] = acc;
		numberOfAccounts++;
	}

	public BankAccount getAccount(int index) {
		return accounts[index - 1];
	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() {
		return "이름 : " + firstName + lastName + ", 계좌의 개수 : " + numberOfAccounts;
	}

}

abstract class BankAccount {
	protected int balance = 0;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void desposit(int amount) {
		if (amount <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else
			balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance - amount < 0 || amount <= 0)
			return false;
		else
			balance -= amount;
		return true;
	}

	public int getBalance() {
		return balance;
	}

	public boolean transfer(int amount, BankAccount otherAccount){
		if (amount > balance) {
			throw new IllegalArgumentException();
			
		}
		
		else {
			balance -= amount;
			otherAccount.balance += amount;
			System.out.println("송금 완료");
			return true;
		}
	}

	public String toString() {
		return "잔액: " + getBalance();
	}

	public abstract String getAcctType();
}

class CheckingAccount extends BankAccount {
	SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount psa) {
		super(balance);
		protectedBy = psa;
	}

	public boolean withdraw(int amount) {
		if (amount < 0 || (balance - amount < 0 && protectedBy.balance < amount - balance))
			return false;
		else {
			if (balance >= amount) {
				balance -= amount;
			} else if ((balance - amount < 0 && amount > 0) && protectedBy.balance >= amount - balance) {
				protectedBy.balance -= (amount - balance);
				balance = 0;
			}

			return true;
		}
	}

	public String getAcctType() {
		return "Checking";
	}
}

class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void updateBalance(int period) {
		balance += (int) ((balance * interestRate * period));
	}

	public String getAcctType() {
		return "Savings";
	}
}

public class 실습14_2 {

	public static void main(String[] args) {
		CheckingAccount tony_account = new CheckingAccount(3000);
		CheckingAccount steve_account = new CheckingAccount(4000);
		
		try {
			tony_account.transfer(5000, steve_account);
			System.out.println("송금완료");
		}
		catch(NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		}
		catch(IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼수 없습니다.");
			System.out.println("송금실패");
		}
		try {
			tony_account.transfer(2000, null);
			System.out.println("송금완료");
		}
		catch(NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패");
		}
		catch(IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼수 없습니다.");
			System.out.println("송금실패");
		}
		
	}
}