import java.util.Scanner;
public class �ý�7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(100*Math.random()+1);
		while(true) {
			System.out.print("1���� 100������ ������ �ϳ��� �����ϼ���:");
			int num = sc.nextInt();
			if(num<1||num>100)
				System.out.println("1�� 100������ ���ڸ� �Է��Ҽ� �ֽ��ϴ�.");
			else if (num>random)
				System.out.println("������ ��������");
			else if (num<random)
				System.out.println("������ ��ū��");
			else
				{System.out.println("����");
				System.out.println("��������");
				break;}
			
		}
	}

}
