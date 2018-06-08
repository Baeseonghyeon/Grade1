class Shape {
	double area() {
		return 0;
	}

	double perimeter() {
		return 0;
	}

}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	double perimeter() {
		return 2 * this.radius * Math.PI;
	}

	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %.2f, 넓이: %.2f", this.perimeter(), this.area());
	}
}

class Triangle extends Shape {
	double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	double area() {
		return Math.sqrt(3) / 4 * this.side * this.side;
	}

	@Override
	double perimeter() {
		return 3 * side;
	}

	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.2f, 넓이: %.2f", this.perimeter(), this.area());
	}
}

class Rectangle extends Shape {
	double width, height;

	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return this.width * this.height;
	}

	@Override
	double perimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %.2f, 넓이: %.2f", this.perimeter(), this.area());
	}
}

public class 실습12_2 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];

		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);

		for (Shape s : shapes)
			System.out.println(s);

	}

}
