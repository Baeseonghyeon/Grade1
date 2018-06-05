import java.util.Scanner;

public class 실습11_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int scores[] = new int[5];
	int sum=0;
	for(int i :scores) {
		System.out.print("성적을 입력하시오:");
		i = sc.nextInt();
		sum+=i;
	}
	int average = sum/scores.length;
	System.out.println("평균 성적은 "+average+"점 입니다.");
	}

}
