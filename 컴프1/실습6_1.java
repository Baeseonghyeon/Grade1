import java.util.Scanner;
public class �ǽ�6_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�ﰢ�� �Ѻ��� ���̸� �Է��ϼ���:");
	double a = sc.nextDouble();
	
	System.out.print("�ﰢ�� �Ѻ��� ���̸� �Է��ϼ���:");
	double b = sc.nextDouble();
	
	System.out.print("�ﰢ�� �Ѻ��� ���̸� �Է��ϼ���:");
	double c = sc.nextDouble();
	if(a<b+c||b<a+c||c<a+b) System.out.println("�ﰢ�� ���� ����");
	
	else System.out.println("�ﰢ�� ���� �Ұ���");
	
	}

}
