import java.util.Scanner;

public class ����5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�⵵�� �Է��ϼ���: ");
		int year = sc.nextInt();
		System.out.print(year+"���� �����ΰ�?:");
		System.out.println(((year%4 == 0) && (year%100!=0))||year%400==0);
	}

}
