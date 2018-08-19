package 정올;

import java.util.*;
public class 행복3228번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(x[j]>x[j+1]) {
					int temp = x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println(x[n-1]-x[0]);
	}

}
