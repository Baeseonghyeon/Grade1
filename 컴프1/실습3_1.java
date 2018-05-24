package lab03;
import java.util.Scanner;
public class 실습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		int y ;
		int z ;
		double result;
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수 입력:");
		x= input.nextInt();
		System.out.print("두번째 수 입력:");
		y= input.nextInt();
		System.out.print("세번째 수 입력:");
		z= input.nextInt();
		System.out.print("세수의 평균은:");
		result = (x+y+z)/3.0;
		System.out.println(result);
		
	}

}
