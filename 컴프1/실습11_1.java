import java.util.Scanner;

public class �ǽ�11_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int scores[] = new int[5];
	int sum=0;
	for(int i :scores) {
		System.out.print("������ �Է��Ͻÿ�:");
		i = sc.nextInt();
		sum+=i;
	}
	int average = sum/scores.length;
	System.out.println("��� ������ "+average+"�� �Դϴ�.");
	}

}
