import java.util.Scanner;

public class ����7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f0 = 0, f1 = 1, f;
		int num;
		do {
			System.out.print("���° �ױ��� ����Ͻðڽ��ϱ�?(3 �̻� �Է�):");
			num = sc.nextInt();
			if (num < 3)
				System.out.println("3 �̻��� ���� �Է��� �ּ���.");

		} while (num < 3);
		System.out.print(f0 + " " + f1);
		for (int i = 3; i <= num; i++) {
			f = f0 + f1;
			f0 = f1;
			f1 = f;
			System.out.print(" " + f);
		}
	}

}
