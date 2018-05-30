class BankAccount {
	private int balance;

	int deposit(int amount) {
		if (amount < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			balance += amount;
		}
		return balance;
	}

	int withdraw(int y) {
		if (y > balance) {
			System.out.println("잔액이 부족합니다.");
		} 
		else if (y<0) {
			System.out.println("잘못 입력하셨습니다.");
		}
		else
			balance = balance - y;
		return balance;
	}

	int getBalance() {
		return this.balance;
	}

	public int transfer(int amount, BankAccount otherAccount) {
		if (amount > this.balance) {
			System.out.println("잔액이 부족합니다.");
		} else if (amount < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			this.withdraw(amount);
			otherAccount.deposit(amount);
		}
		return balance;
	}
}

public class 과제9_2 {

	public static void main(String[] args) {
		BankAccount tony_account = new BankAccount();
		BankAccount steve_account = new BankAccount();

		/*tony_account.deposit(10000);
		steve_account.deposit(500);

		tony_account.transfer(4500, steve_account);

		System.out.println("토니 계좌의 잔액: " + tony_account.getBalance());
		System.out.println("스티브 계좌의 잔액: " + steve_account.getBalance());*/ //테스트코드 1

		
		tony_account.deposit(-2000);
		tony_account.deposit(10000);
		tony_account.withdraw(-2000);

		steve_account.deposit(500);
		steve_account.withdraw(2000);

		tony_account.transfer(20000, steve_account);
		System.out.println("토니 계좌의 잔액: " + tony_account.getBalance());
		System.out.println("스티브 계좌의 잔액: " + steve_account.getBalance());	//테스트 코드2
				
	}

}
