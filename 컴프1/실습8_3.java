import java.util.Scanner;

class Box{
	int width;
	int length;
	int height;
	int Area;
	int Volume;
	
	int getArea() {
		Area = width*length*2+height*(width+length)*2;
		return Area;
	}
	int getVolume(){
		Volume =  width*length*height;
		
		return Volume;
	}
	void printBoxInfo() {
		System.out.println("가로: "+width);
		System.out.println("세로: "+length);
		System.out.println("높이: "+height);
		System.out.println("겉넓이: "+Area);
		System.out.println("부피: " + Volume);
		
	}
}



public class 실습8_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		
		Box x = new Box();
		
		x.width = sc.nextInt();
		System.out.print("세로: ");
		x.length= sc.nextInt();
		System.out.print("높이: ");
		x.height=sc.nextInt();
		x.getArea();
		x.getVolume();
		x.printBoxInfo();
		
		
		

	}

}
