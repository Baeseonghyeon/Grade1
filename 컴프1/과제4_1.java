import java.util.Scanner;

public class 과제4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오.(단위:cm):");
		double r = input.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위:cm):");
		double h = input.nextDouble();
		double area = r*r*Math.PI;
		double v = r*r*h*Math.PI;
		System.out.println("밑면의 넓이는 "+area+"cm^2 이고, 원기둥의 부피는" + v +"cm^3 입니다." );
		
	}

}
