import java.util.Scanner;
public class 실습6_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("삼각형 한변의 길이를 입력하세요:");
	double a = sc.nextDouble();
	
	System.out.print("삼각형 한변의 길이를 입력하세요:");
	double b = sc.nextDouble();
	
	System.out.print("삼각형 한변의 길이를 입력하세요:");
	double c = sc.nextDouble();
	if(a<b+c||b<a+c||c<a+b) System.out.println("삼각형 생성 가능");
	
	else System.out.println("삼각형 생성 불가능");
	
	}

}
