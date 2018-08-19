package 정올;

import java.util.Scanner;
public class 컬러볼 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int n= sc.nextInt();
	
	int [][]x= new int[n][2];
	int []y = new int[n];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<2;j++) {
			x[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(x[i][0]!=x[j][0]&&x[i][1]>x[j][1]) {
				y[i]+=x[j][1];
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(y[i]);
	}
	

	}

}
