package lab04;

import java.util.Scanner;

public class 실습4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double w;
		double h;
		double area;
		double perimeter;
		System.out.print("가로의 길이는?(단위:m):");
		w = input.nextDouble();
		System.out.print("세로의 길이는?(단위:m):");
		h = input.nextDouble();
		area = w*h;
		System.out.println("넓이:"+area+ "m^2");
		perimeter = w*2+h*2;
		System.out.print("둘레:"+perimeter+"m");
	}

}
