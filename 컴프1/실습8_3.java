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
		System.out.println("����: "+width);
		System.out.println("����: "+length);
		System.out.println("����: "+height);
		System.out.println("�ѳ���: "+Area);
		System.out.println("����: " + Volume);
		
	}
}



public class �ǽ�8_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		
		Box x = new Box();
		
		x.width = sc.nextInt();
		System.out.print("����: ");
		x.length= sc.nextInt();
		System.out.print("����: ");
		x.height=sc.nextInt();
		x.getArea();
		x.getVolume();
		x.printBoxInfo();
		
		
		

	}

}
