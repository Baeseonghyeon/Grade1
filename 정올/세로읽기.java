package 정올;

import java.util.*;

public class 세로읽기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x[]= new String[5];
		
		
		for(int i=0;i<5;i++) {
			x[i]=sc.nextLine();
		}
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(x[j].length()>i) {
					System.out.print(x[j].charAt(i));
				}
			}
		}
	}

}
