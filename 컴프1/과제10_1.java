import java.util.Scanner;

class BankAccount{
	String owner;
	String accountNumber;
	int balance;
	boolean withdraw;
	boolean transfer;
	void deposit(int amount){
		if (amount < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			this.balance=0;
		} else {
			this.balance += amount;
		}
		
	}
	public BankAccount(String owner,String accountNumber) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		
	}
	String getOwner() {
		return this.owner;
	}
	String getAccountNumber() {
		return this.accountNumber;
	}
	int getBalance() {
		return this.balance;
	}
	boolean withdraw(int amount) {
		if(amount>=0) {
			if(this.balance>=amount) {
				this.balance-=amount;
				this.withdraw=true;
			}
			else
				this.withdraw=false;
		}
		else 
			this.withdraw=false;
		return this.withdraw;
	}
	boolean transfer(int amount,BankAccount otherAccount) {
		
		if(this.withdraw(amount)) {
			otherAccount.deposit(amount);
			this.transfer=true;
			return this.transfer;
		}
		else {
			this.transfer=false;
			return this.transfer;}
	}
	public String toString() {
		return String.format("%s, %s, %,d", this.getOwner(),this.getAccountNumber(),this.getBalance());
	}
}
public class ����10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� ������ �Է��ϼ���.");
		System.out.print("������: ");
		String P1 = sc.nextLine();
		System.out.print("���� ��ȣ: ");
		String num1 = sc.nextLine();
		BankAccount my_acct = new BankAccount(P1,num1);
		System.out.print("�ʱ� �ݾ�: ");
		int amount = sc.nextInt();
		my_acct.deposit(amount);
		System.out.println();
		
		System.out.println("�� ��° ���� ������ �Է��ϼ���.");
		System.out.print("������: ");
		String P2 = sc.nextLine();
		 P2 = sc.nextLine();
		System.out.print("���� ��ȣ: ");
		String num2 = sc.nextLine();
		BankAccount your_acct = new BankAccount(P1,num1);
		System.out.print("�ʱ� �ݾ�: ");
		amount = sc.nextInt();
		your_acct.deposit(amount);
		
		System.out.println();
		System.out.print("ù ��° ���¿��� �� ��° ���·� �۱��� �ݾ�: ");
		amount=sc.nextInt();
		
		my_acct.transfer(amount,your_acct);
		
		if(my_acct.transfer) {
			System.out.println("�۱ݿϷ�");
		}
		else
			System.out.println("�ܾ׺���");
		System.out.print("ù ��° ������ ����: ");
		System.out.println(my_acct);
		System.out.print("�� ��° ������ ����: ");
		System.out.println(your_acct);
		

	}

}
