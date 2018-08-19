package 정올;

import java.util.*;
public class 자동차10부제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[5];
		int count=0;
		for(int i=0;i<5;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(x[i]==n) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
