package lab03;
import java.util.Scanner;
public class �ǽ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		int y ;
		int z ;
		double result;
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° �� �Է�:");
		x= input.nextInt();
		System.out.print("�ι�° �� �Է�:");
		y= input.nextInt();
		System.out.print("����° �� �Է�:");
		z= input.nextInt();
		System.out.print("������ �����:");
		result = (x+y+z)/3.0;
		System.out.println(result);
		
	}

}
