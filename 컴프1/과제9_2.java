class BankAccount {
	private int balance;

	int deposit(int amount) {
		if (amount < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			balance += amount;
		}
		return balance;
	}

	int withdraw(int y) {
		if (y > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		} 
		else if (y<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
			System.out.println("�ܾ��� �����մϴ�.");
		} else if (amount < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			this.withdraw(amount);
			otherAccount.deposit(amount);
		}
		return balance;
	}
}

public class ����9_2 {

	public static void main(String[] args) {
		BankAccount tony_account = new BankAccount();
		BankAccount steve_account = new BankAccount();

		/*tony_account.deposit(10000);
		steve_account.deposit(500);

		tony_account.transfer(4500, steve_account);

		System.out.println("��� ������ �ܾ�: " + tony_account.getBalance());
		System.out.println("��Ƽ�� ������ �ܾ�: " + steve_account.getBalance());*/ //�׽�Ʈ�ڵ� 1

		
		tony_account.deposit(-2000);
		tony_account.deposit(10000);
		tony_account.withdraw(-2000);

		steve_account.deposit(500);
		steve_account.withdraw(2000);

		tony_account.transfer(20000, steve_account);
		System.out.println("��� ������ �ܾ�: " + tony_account.getBalance());
		System.out.println("��Ƽ�� ������ �ܾ�: " + steve_account.getBalance());	//�׽�Ʈ �ڵ�2
				
	}

}
