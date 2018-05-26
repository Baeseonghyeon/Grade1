import java.util.Scanner;

public class 과제7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f0 = 0, f1 = 1, f;
		int num;
		do {
			System.out.print("몇번째 항까지 출력하시겠습니까?(3 이상 입력):");
			num = sc.nextInt();
			if (num < 3)
				System.out.println("3 이상의 수를 입력해 주세요.");

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
