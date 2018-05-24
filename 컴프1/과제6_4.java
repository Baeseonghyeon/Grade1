import java.util.Scanner;

public class 과제6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입려하세요:");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요:");
		int date = sc.nextInt();

		int total_days = (year-1900)*365;
		total_days += (year-1900)/4 - year/100+(year-1900)/400;
		if ((((year%4==0)&&(year/100!=0))||year%400==0)&&(month==1||month==2)) 
			total_days -= 1;
		
		
		switch(month)
		{ case 1:
			break;
		case 2:
			total_days+=31;
			break;
		case 3:
			total_days+=31+28;
			break;
		case 4:
			total_days+=31*2+28;
			break;
		case 5:
			total_days+=31*2+28+30;
			break;
		case 6:
			total_days+=31*3+28+30;
			break;
		case 7:
			total_days+=31*3+28+30*2;
			break;
		case 8:
			total_days+=31*4+28+30*2;
			break;
		case 9:
			total_days+=31*4+28+30*2;
			break;
		case 10:
			total_days+=31*4+28+30*3;
			break;
		case 11:
			total_days+=31*5+28+30*3;
			break;
		case 12:
			total_days+=31*5+28+30*4;
			
		}
		
		total_days+=date;
		
		int days = total_days%7;
		
		switch (days) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
		}
	}

}