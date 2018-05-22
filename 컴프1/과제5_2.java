import java.util.Scanner;

public class 과제5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.print(year+"년은 윤년인가?:");
		System.out.println(((year%4 == 0) && (year%100!=0))||year%400==0);
	}

}
