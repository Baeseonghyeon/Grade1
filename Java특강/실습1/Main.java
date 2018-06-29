package 실습1;

public class Main {

	public static void main(String[] args) {
	Customer cus = new Customer("name",3000,10,"aa");
	Accountant at = new Accountant();
	at.taxCalculator(cus);
	}
}
