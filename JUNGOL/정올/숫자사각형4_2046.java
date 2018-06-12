package 정올;

import java.util.Scanner;

public class 숫자사각형4_2046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m == 1) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		if (m == 2) {
			boolean even = false;
			int count = 0;
			while (true) {
				if (even == false) {
					for (int i = 1; i <= n; i++) {
						System.out.print(i + " ");
						if (i == n) {
							even = true;
							count++;
							break;
						}
					}
					System.out.println();
				} else {
					for (int i = n; i > 0; i--) {
						System.out.print(i + " ");

						if (i == 1) {
							even = false;
							count++;
							break;
						}

					}
					System.out.println();

				}
				if (count == n) {
					even = false;
					break;
				}
			}
		}
		if (m == 3) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
		}
	}

}
