package 정올;
import java.util.*;
public class 프로그래머의날 {
	static int DAY= 256;
	static int MONTH=1;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	int p ;//그레고리력 
	boolean q = false;//윤년
	
	if(year<1918) p=-1;
	else if(year>1918) p=1;
	else p=0;//year==1918
	
	if(p==-1&&(year%4==0)) q=true;
	else if(p==1&&((year%4==0)&&(year%100!=0)||(year%400==0))) q=true;
	
	cal(p,year,q);
	}
	
	public static void cal(int p,int year,boolean q){
		while(true) {
		if(p!=0&&DAY>0&&q==false) {
			switch(MONTH) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY-=31; MONTH+=1;continue;
			case 4: case 6: case 9: case 11: DAY-=30;MONTH+=1;continue;
			case 2: DAY-=28;MONTH+=1;continue;
			
			}
		}
		if(p!=0&&DAY>0&&q==true) {
			switch(MONTH) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY-=31; MONTH+=1;continue;
			case 4: case 6: case 9: case 11: DAY-=30;MONTH+=1;continue;
			case 2: DAY-=29;MONTH+=1;continue;
			
			}
		
		}
		if(p==0&&DAY>0) {
			switch(MONTH) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY-=31; MONTH+=1;continue;
			case 4: case 6: case 9: case 11: DAY-=30;MONTH+=1;continue;
			case 2: DAY-=15;MONTH+=1;continue;
			
			}	
		}
		break;
		}
		if(p!=0&&q==true) {
		switch(MONTH-1) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY+=31; break;
			case 4: case 6: case 9: case 11: DAY+=30;break;
			case 2: DAY+=29;break;
			}
		}
		else if((p!=0&&q==false)) {
			switch(MONTH-1) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY+=31; break;
			case 4: case 6: case 9: case 11: DAY+=30;break;
			case 2: DAY+=28;break;
			}
		}
		else {
			switch(MONTH-1) {
			case 1: case 3: case 5: case 7: case 8:case 10:case 12: DAY+=31; break;
			case 4: case 6: case 9: case 11: DAY+=30;break;
			case 2: DAY+=15;break;
			}
		}
			
		MONTH-=1;
		System.out.printf("%02d.%02d.%d",DAY,MONTH,year);
	}

}
