package 초딩정올모의2018;

import java.util.Scanner;

public class 출석체크 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int s[] = new int[n];
	int cp=0;
	for(int i=0;i<n;i++) {
		s[i] = sc.nextInt();
	}
	for(int i=1;i<n+1;i++) {
		for(int j=0;j<n;j++) {
			if(s[j]==i) {
				break;
			}
			if(j==n-1) {
				System.out.print(i+" ");
			}
		}
	}
	}
}