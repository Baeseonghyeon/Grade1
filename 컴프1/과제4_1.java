import java.util.Scanner;

public class ����4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�.(����:cm):");
		double r = input.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ�.(����:cm):");
		double h = input.nextDouble();
		double area = r*r*Math.PI;
		double v = r*r*h*Math.PI;
		System.out.println("�ظ��� ���̴� "+area+"cm^2 �̰�, ������� ���Ǵ�" + v +"cm^3 �Դϴ�." );
		
	}

}
