import java.util.Scanner;

public class 과제31 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double x;
		 double result;
		 System.out.print("화씨 온도를 입력하시오");
		 x =input.nextDouble();
		 result = 5/9.0*(x-32);
		 System.out.print("섭씨온도는"+result+"입니다.");
		 

	}

}
