import java.util.Scanner;
//������ ��� ���α׷�

public class ����4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("500�� ����:");
		int five_h = input.nextInt();//500�� ���� ����,������ ������ �����̹Ƿ� int �� ���
		
		System.out.print("100�� ����:");
		int one_h = input.nextInt();//100�� ���� ����,������ ������ ������
		
		System.out.print("50�� ����:");
		int fifty = input.nextInt();//50�� ���� ����,������ ������ ������
		
		System.out.print("10�� ����:");
		int ten = input.nextInt();//10�� ���� ����,������ ������ ������
		int result = five_h*500+one_h*100+fifty*50+ten*10;//������ ������ ������
		
		System.out.print("�� �ݾ���"+result+"�Դϴ�." );
		
	}

}
