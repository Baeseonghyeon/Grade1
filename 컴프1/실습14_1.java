import java.util.*;
public class 실습14_1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a,b;
	while(true) {
	
	try {
		System.out.print("어떤 수를 나누시겠습니까?>> ");
		a= sc.nextInt();
		System.out.print("어떤 수로 나누시겠습니까?>> ");
		b = sc.nextInt();
		int result = a/b;
		System.out.println(a+"/"+b+"="+a/b);
		break;
	}
	catch(ArithmeticException e){
		System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
		
	}
	catch(InputMismatchException e) {
		System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		sc.nextLine();
	}
	
	}
	}
}
