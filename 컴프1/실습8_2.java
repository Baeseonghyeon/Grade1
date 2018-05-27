import java.util.Scanner;

public class 실습8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("거꾸로 출력할 문자열>> ");
		String s1 = sc.next();
		
		System.out.print("거꾸로 출력한 문자열>> ");
		for (int i = s1.length() -1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		
	}

}
