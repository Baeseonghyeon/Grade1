class Circle {
	private double radious;
	private double X;
	private double Y;

	void setRadius(double radious) {
		if(radious<0) {
			this.radious = 0;
		}
		else
		this.radious = radious;
	}

	void setX(double X) {
		this.X = X;
	}

	void setY(double Y) {
		this.Y = Y;
	}

	double getRadious() {
		
		return this.radious;
	}

	double getX() {

		return this.X;
	}

	double getY() {

		return this.Y;
	}
	double area() {
		
		double area = this.radious*this.radious*Math.PI;
		return area;
	}
}

public class 과제9_1 {

	public static void main(String[] args) {
	Circle c1 = new Circle();
	c1.setRadius(3.6);
	c1.setX(0.0);
	c1.setY(1.5);
	
	System.out.println("반지름: "+c1.getRadious());
	System.out.println("중심 좌표: "+"("+ c1.getX() + "," + c1.getY()+")");
	System.out.printf("넓이: %.2f\n", c1.area());
	
	Circle c2 = new Circle();
	c2.setRadius(-5.0); // 잘못된 값으로 설정했을 땐?
	c2.setX(1.0);
	c2.setY(2.2);
	
	System.out.println("반지름: "+c2.getRadious());
	System.out.println("중심 좌표: "+"("+ c2.getX() + "," + c2.getY()+")");
	System.out.printf("넓이: %.2f\n", c2.area());
	

	}

}
