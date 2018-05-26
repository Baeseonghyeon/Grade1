
public class 실습7_2 {

	public static void main(String[] args) {
		double dx = Math.PI / 1000;
		double area=0.0;
		double y;
		
		for (int i = 0; i <= 1000; i++) {
			y = Math.sin(i * Math.PI / 1000) * dx;
			
			area += y;
		
		}

		System.out.println("적분값"+area);
		
	}
	
}
