import java.util.Scanner;

class Bank {
	Customer[] customers;
	int numberOfCustomers;

	Bank() {
		numberOfCustomers = 0;
		customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		numberOfCustomers++;
		customers[numberOfCustomers - 1] = customer;

	}

	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}
}

class Customer {
	String firstName, lastName;
	BankAccount account;

	Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setBankAccount(BankAccount account) {
		this.account = account;
	}

	public String toString() {
		return String.format("%s %s : %s", this.firstName, this.lastName, this.account.getBalance());
	}
}

class BankAccount {
	protected int balance;

	void deposit(int amount) {
		if (amount < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			this.balance = 0;
		} else {
			this.balance += amount;
		}

	}

	public BankAccount(int balance) {
		this.balance = balance;
	}

	int getBalance() {
		return this.balance;
	}

	boolean withdraw(int amount) {
		if (amount >= 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				return true;
			} else
				return false;
		} else
			return false;
	}

	boolean transfer(int amount, BankAccount otherAccount) {

		if (this.withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
}

public class ����11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank x = new Bank();

		System.out.println("ù ��° ���� ������ �Է��ϼ���.");
		System.out.print("�������� ��: ");
		String P1 = sc.nextLine();
		System.out.print("�������� �̸�: ");
		String name1 = sc.nextLine();

		System.out.println("�� ��° ���� ������ �Է��ϼ���.");
		System.out.print("�������� ��: ");
		String P2 = sc.nextLine();
		System.out.print("�������� �̸�: ");
		String name2 = sc.nextLine();

		System.out.println("�� ��° ���� ������ �Է��ϼ���.");
		System.out.print("�������� ��: ");
		String P3 = sc.nextLine();
		System.out.print("�������� �̸�: ");
		String name3 = sc.nextLine();

		Customer People1 = new Customer(P1, name1);
		x.addCustomer(People1);
		People1.account = new BankAccount(50000);
		Customer People2 = new Customer(P2, name2);
		x.addCustomer(People2);
		People2.account = new BankAccount(30000);
		Customer People3 = new Customer(P3, name3);
		x.addCustomer(People3);
		People3.account = new BankAccount(10000);

		while (true) {
			if (x.customers[0].account.balance > x.customers[1].account.balance) {
				int temp = x.customers[1].account.balance;
				x.customers[1].account.balance = x.customers[0].account.balance;
				x.customers[0].account.balance = temp;
			}
			if (x.customers[1].account.balance > x.customers[2].account.balance) {
				int temp = x.customers[2].account.balance;
				x.customers[2].account.balance = x.customers[1].account.balance;
				x.customers[1].account.balance = temp;
				continue;
			}
			break;

		}
		x.customers[2].account.transfer(x.customers[2].account.balance / 2, x.customers[0].account);
		System.out.println(People1);
		System.out.println(People2);
		System.out.println(People3);
	}

}
