package Hw10;

public class Bank {
	private Customer[] customer;
	private int numOfCustomer;
	
	public Bank(int ncus) {
		customer = new Customer[ncus];
		numOfCustomer = 0;
	}

	public void addCustomer(String f, String l) {
		customer[numOfCustomer] = new Customer(f, l);
		numOfCustomer++;
	}

	public int getNumofCustomers() {
		return numOfCustomer;
	}

	public Customer getCustomer(int index) {
		return customer[index];
	}

	public void transfer(int from, int to, double amount) {
		// �ϼ�
	}

	public double getTotalBalance() {
		// �ϼ�
		return 0;
	}
}
