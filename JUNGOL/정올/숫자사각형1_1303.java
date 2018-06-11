package 정올;

import java.util.Scanner;

public class 숫자사각형1_1303 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int num=1;
	int count=0;
	for(int i=1;i<=n*m;i++) {
		System.out.print(i+" ");
		count++;
		if(count==m) {
			System.out.println();
			count=0;
		}
	}

	}

}
