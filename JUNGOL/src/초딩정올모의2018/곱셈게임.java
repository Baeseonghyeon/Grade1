package 초딩정올모의2018;

import java.util.Scanner;

public class 곱셈게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b=  sc.nextInt();
		int[] game= new int[n];
		game[0] = a;
		game[1] = b;
		for(int i=2;i<n;i++) {
			game[i]=(game[i-1]*game[i-2])%10000;
		}
		System.out.println(game[n-1]%10000);
	}
	
}
