import java.util.Scanner;

public class �ǽ�8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ųٷ� ����� ���ڿ�>> ");
		String s1 = sc.next();
		
		System.out.print("�Ųٷ� ����� ���ڿ�>> ");
		for (int i = s1.length() -1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		
	}

}
