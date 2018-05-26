import java.util.Scanner;

public class 과제7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int withdraw_money = 0;
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();

			if (num == 1) {
				while (true) {
					System.out.print("예금액>");
					int inputmoney = sc.nextInt();

					if (inputmoney < 0) {
						System.out.println("금액이 잘못 입력되었습니다.(음수 입력)");

					} else {
						money += inputmoney;
						break;
					}
				}
			} else if (num == 2) {
				while (true) {
					System.out.print("출금액>");
					withdraw_money = sc.nextInt();

					if (withdraw_money < 0) {
						System.out.println("금액이 잘못 입력되었습니다.(음수 입력)");
						withdraw_money = 0;
						

					} else if (money - withdraw_money < 0) {
						System.out.println("잔고가 부족합니다.\n다시 입력해주세요.");
						withdraw_money = 0;
						

					} else {
						money -= withdraw_money;
						withdraw_money = 0;
						break;
					}

				}
			} else if (num == 3) {
				System.out.println("잔고>" + (money));

			} else if (num == 4) {
				System.out.println("프로그램 종료");
				break;
			} else
				System.out.println("잘못된 입력입니다.");
		}

	}
}
