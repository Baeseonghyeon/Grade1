package 정올;

import java.util.*;
public class 화살표3229번 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=0;
		int x[]= new int[100000];
		int y[]= new int[n];
		
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			int j=sc.nextInt();
			
			x[i] = k;
			y[i] = j;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(y[j]>=y[j+1]) {
					int temp = y[j];
					y[j]=y[j+1];
					y[j+1]=temp;
					
					temp =x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		int count=0;
		int start=0;
		for(int i=start;i<n-1;i++) {
			if(y[i]==y[i+1]) {
				count++;
				if(i!=n-2)
				continue;
			} 
				for(int j=start;j<count;j++) {
					for(int k=start;k<count;k++) {
						if(x[k]>x[k+1]) {
						int temp = x[k];
						x[k]=x[k+1];
						x[k+1]=temp;}
					}
				}
				for(int k=start;k<count;k++) {
					if(k!=start) {
					int a=x[k+1]-x[k];
					int b=x[k]-x[k-1];
					if(a>b) {
						sum+=b;
					}
					else sum+=a;
					}
					else sum+=x[k+1]-x[k];
					
				}
				
				sum+=x[count]-x[count-1];
				count++;
				start=count;
		}
		System.out.println(sum);
		

	}

}
