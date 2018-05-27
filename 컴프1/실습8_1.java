
class BankAccount {
	int balance;

	int deposit(int x) {
		balance += x;
		return balance;
	}

	int withdraw(int y) {
		balance = balance - y;
		return balance;
	}

	void printBalance() {
		System.out.println(balance);
	}
}

public class 실습8_1 {

	public static void main(String[] args) {
		BankAccount my_account = new BankAccount();
		BankAccount friend_account = new BankAccount();

		my_account.deposit(10000);
		System.out.print("예금 후의 내 계좌의 잔액: ");
		my_account.printBalance();
		my_account.withdraw(3000);
		System.out.print("출금 후의 내 계좌의 잔액: ");
		my_account.printBalance();
		
		friend_account.deposit(20000);
		System.out.print("예금 후의  친구 계좌의 잔액: ");
		friend_account.printBalance();
		friend_account.withdraw(17000);
		System.out.print("출금 후의 친구 계좌의 잔액: ");
		friend_account.printBalance();
		
		BankAccount tony_account = new BankAccount();
		BankAccount ironMan_account = tony_account;
		
		tony_account.deposit(100000);
		System.out.print("예금 후 토니 계좌의 잔액: ");
		tony_account.printBalance();
		System.out.print("예금 후 아이언맨 계좌의 잔액: ");
		ironMan_account.printBalance();
		
		
		ironMan_account.withdraw(60000);
		System.out.print("출금 후 토니 계좌의 잔액: ");
		tony_account.printBalance();
		System.out.print("출금 후 아이언맨 계좌의 잔액: ");
		ironMan_account.printBalance();
		
		
	}

}
