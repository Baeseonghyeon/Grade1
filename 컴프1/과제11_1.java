import java.util.Scanner;

public class ����11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ�0)");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("-----------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("-----------------------");
				for (int i = 0; i < 10; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?(1~10)");
				int x = sc.nextInt();
				if (seat[x-1] == 0) {
					seat[x-1] = 1;
					System.out.println("���� �Ǿ����ϴ�.");
					continue;
				}
				if (seat[x-1] == 1) {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}

			} else if (a == 0) {
				System.out.println("����.");
				break;
			} else {
				System.out.println("�ٽ��Է�");
				continue;
			}

		}
	}

}
