import java.util.Scanner;

public class ����6_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int month = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
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
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
		}
	}

}