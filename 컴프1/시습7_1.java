import java.util.Scanner;
public class 시습7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(100*Math.random()+1);
		while(true) {
			System.out.print("1부터 100까지의 정수중 하나를 선택하세요:");
			int num = sc.nextInt();
			if(num<1||num>100)
				System.out.println("1과 100사이의 숫자만 입력할수 있습니다.");
			else if (num>random)
				System.out.println("정답은 더작은수");
			else if (num<random)
				System.out.println("정답은 더큰수");
			else
				{System.out.println("정답");
				System.out.println("게임종료");
				break;}
			
		}
	}

}
