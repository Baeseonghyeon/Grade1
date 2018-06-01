import java.util.Scanner;

class BankAccount{
	String owner;
	String accountNumber;
	int balance;
	boolean withdraw;
	boolean transfer;
	void deposit(int amount){
		if (amount < 0) {
			System.out.println("잘못 입력하셨습니다.");
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
public class 과제10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 고객의 정보를 입력하세요.");
		System.out.print("예금주: ");
		String P1 = sc.nextLine();
		System.out.print("계좌 번호: ");
		String num1 = sc.nextLine();
		BankAccount my_acct = new BankAccount(P1,num1);
		System.out.print("초기 금액: ");
		int amount = sc.nextInt();
		my_acct.deposit(amount);
		System.out.println();
		
		System.out.println("두 번째 고객의 정보를 입력하세요.");
		System.out.print("예금주: ");
		String P2 = sc.nextLine();
		 P2 = sc.nextLine();
		System.out.print("계좌 번호: ");
		String num2 = sc.nextLine();
		BankAccount your_acct = new BankAccount(P1,num1);
		System.out.print("초기 금액: ");
		amount = sc.nextInt();
		your_acct.deposit(amount);
		
		System.out.println();
		System.out.print("첫 번째 계좌에서 두 번째 계좌로 송금할 금액: ");
		amount=sc.nextInt();
		
		my_acct.transfer(amount,your_acct);
		
		if(my_acct.transfer) {
			System.out.println("송금완료");
		}
		else
			System.out.println("잔액부족");
		System.out.print("첫 번째 계좌의 정보: ");
		System.out.println(my_acct);
		System.out.print("두 번째 계좌의 정보: ");
		System.out.println(your_acct);
		

	}

}
