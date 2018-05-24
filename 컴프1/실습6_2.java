import java.util.Scanner;

public class 실습6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 적으라(1~12):");
		int month = sc.nextInt(); ;
		
		switch (month ) {
		case 12:
		case 1 :
		case 2:
			System.out.println("겨울이다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄이다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름이다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을이다");
			break;
		default:
			System.out.println("똑바로 입력하셈");
			break;
				
		}

	}

}
