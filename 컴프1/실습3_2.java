package lab03;

import java.util.Scanner;

public class 실습32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x;
		 int result;
		 Scanner input = new Scanner(System.in);
		 System.out.print("월급을 입력하세요(단위 만원):");
		 x=input.nextInt();
		 result= 120*x;
		 System.out.print("저축액은"+result +"만원 입니다." );
	}

}
