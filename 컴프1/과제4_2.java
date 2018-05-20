import java.util.Scanner;
//저금통 계산 프로그램

public class 과제4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("500원 갯수:");
		int five_h = input.nextInt();//500원 동전 갯수,동전의 개수는 정수이므로 int 를 사용
		
		System.out.print("100원 갯수:");
		int one_h = input.nextInt();//100원 동전 갯수,동전의 개수는 정수임
		
		System.out.print("50원 갯수:");
		int fifty = input.nextInt();//50원 동전 갯수,동전의 개수는 정수임
		
		System.out.print("10원 갯수:");
		int ten = input.nextInt();//10원 동전 갯수,동전의 개수는 정수임
		int result = five_h*500+one_h*100+fifty*50+ten*10;//동전의 개수는 정수임
		
		System.out.print("총 금액은"+result+"입니다." );
		
	}

}
