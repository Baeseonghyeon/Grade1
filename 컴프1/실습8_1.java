
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

public class �ǽ�8_1 {

	public static void main(String[] args) {
		BankAccount my_account = new BankAccount();
		BankAccount friend_account = new BankAccount();

		my_account.deposit(10000);
		System.out.print("���� ���� �� ������ �ܾ�: ");
		my_account.printBalance();
		my_account.withdraw(3000);
		System.out.print("��� ���� �� ������ �ܾ�: ");
		my_account.printBalance();
		
		friend_account.deposit(20000);
		System.out.print("���� ����  ģ�� ������ �ܾ�: ");
		friend_account.printBalance();
		friend_account.withdraw(17000);
		System.out.print("��� ���� ģ�� ������ �ܾ�: ");
		friend_account.printBalance();
		
		BankAccount tony_account = new BankAccount();
		BankAccount ironMan_account = tony_account;
		
		tony_account.deposit(100000);
		System.out.print("���� �� ��� ������ �ܾ�: ");
		tony_account.printBalance();
		System.out.print("���� �� ���̾�� ������ �ܾ�: ");
		ironMan_account.printBalance();
		
		
		ironMan_account.withdraw(60000);
		System.out.print("��� �� ��� ������ �ܾ�: ");
		tony_account.printBalance();
		System.out.print("��� �� ���̾�� ������ �ܾ�: ");
		ironMan_account.printBalance();
		
		
	}

}
