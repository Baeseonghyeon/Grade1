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

public class ����9_1 {

	public static void main(String[] args) {
	Circle c1 = new Circle();
	c1.setRadius(3.6);
	c1.setX(0.0);
	c1.setY(1.5);
	
	System.out.println("������: "+c1.getRadious());
	System.out.println("�߽� ��ǥ: "+"("+ c1.getX() + "," + c1.getY()+")");
	System.out.printf("����: %.2f\n", c1.area());
	
	Circle c2 = new Circle();
	c2.setRadius(-5.0); // �߸��� ������ �������� ��?
	c2.setX(1.0);
	c2.setY(2.2);
	
	System.out.println("������: "+c2.getRadious());
	System.out.println("�߽� ��ǥ: "+"("+ c2.getX() + "," + c2.getY()+")");
	System.out.printf("����: %.2f\n", c2.area());
	

	}

}
