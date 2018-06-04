import java.util.Scanner;

public class 과제11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		while (true) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는0)");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				System.out.println("-----------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("-----------------------");
				for (int i = 0; i < 10; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.print("몇번째 좌석을 예약하시겠습니까?(1~10)");
				int x = sc.nextInt();
				if (seat[x-1] == 0) {
					seat[x-1] = 1;
					System.out.println("예약 되었습니다.");
					continue;
				}
				if (seat[x-1] == 1) {
					System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
					continue;
				}

			} else if (a == 0) {
				System.out.println("종료.");
				break;
			} else {
				System.out.println("다시입력");
				continue;
			}

		}
	}

}
