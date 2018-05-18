import java.util.Scanner;

public class 과제32 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int x;
		 double result;
		 System.out.print("반지름을 입력하세요(단위 cm):");
		 x = input.nextInt();
		 result = 4.0/3.0*x*x*x*Math.PI;
		 System.out.print("해당하는 구의 부피는"+result+"cm^3 입니다.");
	}

}
