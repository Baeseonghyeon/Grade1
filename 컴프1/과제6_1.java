import java.util.Scanner;

public class ����6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�  ����, ����, �� �߿��� �Է��ϼ���. ");
		
		System.out.print("ö��>>");
		String ö�� = sc.next();
		System.out.print("����>>");
		String ���� = sc.next();
		
		if(ö��.equals("����")) {
			
			if(����.equals("����"))
				System.out.println("Winner? ����");
			else if(����.equals("��"))
				System.out.println("Winner? ö��");
			else System.out.println("Winner? ���º�");
		}
		else if(ö��.equals("����")) {
			if(����.equals("����"))
				System.out.println("Winner? ö��");
			else if(����.equals("��"))
				System.out.println("Winner? ����");
			else System.out.println("Winner? ���º�");
		}
		else if(ö��.equals("��")) {
			if(����.equals("����"))
				System.out.println("Winner? ����");
			else if(����.equals("����"))
				System.out.println("Winner? ö��");
			else System.out.println("Winner? ���º�");
		}
		
	}
}

