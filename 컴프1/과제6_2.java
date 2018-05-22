import java.util.Scanner;

public class 과제6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연도를 입려하세요:");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요:");
		int date = sc.nextInt();

		if (year < 1900 && (month == 1 || month == 2) || year > 2100 && month > 2)
			System.out.println("알고리즘을 사용할 수 없습니다.");

		else if (year < 1 || month > 13 || month < 1 || date < 1)
			System.out.println("입력이 잘못 되었습니다.");
		else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31)
			System.out.println("입력이 잘못 되었습니다.");
		else if ((month == 4 || month == 6 || month == 7 || month == 9 || month == 11) && date > 30)
			System.out.println("입력이 잘못 되었습니다.");

		else if ((((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0))
			if (month == 2 && date > 29)
				System.out.println("입력이 잘못 되었습니다.");

			else if (!(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) && month == 2 && date > 28)
				System.out.println("입력이 잘못 되었습니다.");

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
					System.out.println(year + "년" + month + "월" + date + "일은 일요일 입니다.");
					break;
				case 1:
					System.out.println(year + "년" + month + "월" + date + "일은 월요일 입니다.");
					break;
				case 2:
					System.out.println(year + "년" + month + "월" + date + "일은 화요일 입니다.");
					break;
				case 3:
					System.out.println(year + "년" + month + "월" + date + "일은 수요일 입니다.");
					break;
				case 4:
					System.out.println(year + "년" + month + "월" + date + "일은 목요일 입니다.");
					break;
				case 5:
					System.out.println(year + "년" + month + "월" + date + "일은 금요일 입니다.");
					break;
				case 6:
					System.out.println(year + "년" + month + "월" + date + "일은 토요일 입니다.");
				}
			}
	}
}