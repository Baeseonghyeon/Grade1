import java.util.Scanner;

public class ����32 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int x;
		 double result;
		 System.out.print("�������� �Է��ϼ���(���� cm):");
		 x = input.nextInt();
		 result = 4.0/3.0*x*x*x*Math.PI;
		 System.out.print("�ش��ϴ� ���� ���Ǵ�"+result+"cm^3 �Դϴ�.");
	}

}
