package 정올;

import java.util.Scanner;

public class 배열555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x[] = new char[10];
		for(int i=0;i<10;i++) {
			x[i]= sc.next().charAt(i);
		}
		for(int i=0;i<10;i++) {
			System.out.print(x[i]);
		}
	}

}
