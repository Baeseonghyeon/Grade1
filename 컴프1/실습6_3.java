import java.util.Scanner;

public class 실습6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("컴퓨터 프로그래밍1 점수: ");
		double x = sc.nextInt();
		System.out.print("디지털 신호처리 점수: ");
		double y = sc.nextInt();
		System.out.print("사랑과 결혼의 경제학 점수: ");
		double z = sc.nextInt();
		
		double w= x+y+z;
		double k =(x+y+z)/3;
		System.out.println("총점:"+w+"\n평균"+k);
		if(k>=90)
			System.out.println("학점: A");
		else if(k>=80)
			System.out.println("학점: B");
		else if(k>=70)
			System.out.println("학점: C");
		else if(k>=60)
			System.out.println("학점: D");
		else 
			System.out.println("학점: F");
	}	

}
