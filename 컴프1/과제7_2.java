import java.util.Scanner;

public class ����7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int withdraw_money = 0;
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.����| 2.���| 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����>");
			int num = sc.nextInt();

			if (num == 1) {
				while (true) {
					System.out.print("���ݾ�>");
					int inputmoney = sc.nextInt();

					if (inputmoney < 0) {
						System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�.(���� �Է�)");

					} else {
						money += inputmoney;
						break;
					}
				}
			} else if (num == 2) {
				while (true) {
					System.out.print("��ݾ�>");
					withdraw_money = sc.nextInt();

					if (withdraw_money < 0) {
						System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�.(���� �Է�)");
						withdraw_money = 0;
						

					} else if (money - withdraw_money < 0) {
						System.out.println("�ܰ� �����մϴ�.\n�ٽ� �Է����ּ���.");
						withdraw_money = 0;
						

					} else {
						money -= withdraw_money;
						withdraw_money = 0;
						break;
					}

				}
			} else if (num == 3) {
				System.out.println("�ܰ�>" + (money));

			} else if (num == 4) {
				System.out.println("���α׷� ����");
				break;
			} else
				System.out.println("�߸��� �Է��Դϴ�.");
		}

	}
}
