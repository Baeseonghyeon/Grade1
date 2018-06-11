package 정올;

import java.util.Scanner;

public class 숫자사각형2_1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 1;
		int count = 0;
		boolean even = false;
		while (true) {
			if (even == false) {
				for (int i = 0; i < m; i++) {
					System.out.print(num + " ");
					num++;
					count++;
					if (count == m) {
						System.out.println();
						count = 0;
						even = true;
						break;
					}
				}
			} else {

				for (int j = num + m - 1; j > num - 1; j--) {
					System.out.print(j + " ");
					count++;
					if (count == m) {
						System.out.println();
						num += m;
						count = 0;
						even = false;
						break;
					}
				}
			}
			if (num - 1 == n * m)
				break;

		}
	}

}