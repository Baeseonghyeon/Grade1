import java.util.Scanner;

public class �ǽ�6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǻ�� ���α׷���1 ����: ");
		double x = sc.nextInt();
		System.out.print("������ ��ȣó�� ����: ");
		double y = sc.nextInt();
		System.out.print("����� ��ȥ�� ������ ����: ");
		double z = sc.nextInt();
		
		double w= x+y+z;
		double k =(x+y+z)/3;
		System.out.println("����:"+w+"\n���"+k);
		if(k>=90)
			System.out.println("����: A");
		else if(k>=80)
			System.out.println("����: B");
		else if(k>=70)
			System.out.println("����: C");
		else if(k>=60)
			System.out.println("����: D");
		else 
			System.out.println("����: F");
	}	

}
