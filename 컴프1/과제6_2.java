import java.util.Scanner;

public class ����6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���:");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int month = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int date = sc.nextInt();

		if (year < 1900 && (month == 1 || month == 2) || year > 2100 && month > 2)
			System.out.println("�˰����� ����� �� �����ϴ�.");

		else if (year < 1 || month > 13 || month < 1 || date < 1)
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31)
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
		else if ((month == 4 || month == 6 || month == 7 || month == 9 || month == 11) && date > 30)
			System.out.println("�Է��� �߸� �Ǿ����ϴ�.");

		else if ((((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0))
			if (month == 2 && date > 29)
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");

			else if (!(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) && month == 2 && date > 28)
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");

			else {
				int total_days = (year - 1900) * 365;
				total_days += (year - 1900) / 4;
				if ((((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) && (month == 1 || month == 2))
					total_days -= 1;

				switch (month) {
				case 1:
					break;
				case 2:
					total_days += 31;
					break;
				case 3:
					total_days += 31 + 28;
					break;
				case 4:
					total_days += 31 * 2 + 28;
					break;
				case 5:
					total_days += 31 * 2 + 28 + 30;
					break;
				case 6:
					total_days += 31 * 3 + 28 + 30;
					break;
				case 7:
					total_days += 31 * 3 + 28 + 30 * 2;
					break;
				case 8:
					total_days += 31 * 4 + 28 + 30 * 2;
					break;
				case 9:
					total_days += 31 * 5 + 28 + 30 * 2;
					break;
				case 10:
					total_days += 31 * 5 + 28 + 30 * 3;
					break;
				case 11:
					total_days += 31 * 6 + 28 + 30 * 3;
					break;
				case 12:
					total_days += 31 * 6 + 28 + 30 * 4;

				}

				total_days += date;

				int days = total_days % 7;

				switch (days) {
				case 0:
					System.out.println(year + "��" + month + "��" + date + "���� �Ͽ��� �Դϴ�.");
					break;
				case 1:
					System.out.println(year + "��" + month + "��" + date + "���� ������ �Դϴ�.");
					break;
				case 2:
					System.out.println(year + "��" + month + "��" + date + "���� ȭ���� �Դϴ�.");
					break;
				case 3:
					System.out.println(year + "��" + month + "��" + date + "���� ������ �Դϴ�.");
					break;
				case 4:
					System.out.println(year + "��" + month + "��" + date + "���� ����� �Դϴ�.");
					break;
				case 5:
					System.out.println(year + "��" + month + "��" + date + "���� �ݿ��� �Դϴ�.");
					break;
				case 6:
					System.out.println(year + "��" + month + "��" + date + "���� ����� �Դϴ�.");
				}
			}
	}
}