import java.util.*;
public class �ǽ�14_1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a,b;
	while(true) {
	
	try {
		System.out.print("� ���� �����ðڽ��ϱ�?>> ");
		a= sc.nextInt();
		System.out.print("� ���� �����ðڽ��ϱ�?>> ");
		b = sc.nextInt();
		int result = a/b;
		System.out.println(a+"/"+b+"="+a/b);
		break;
	}
	catch(ArithmeticException e){
		System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
		
	}
	catch(InputMismatchException e) {
		System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
		sc.nextLine();
	}
	
	}
	}
}
