class Car{
	private double speed;
	private String color;
	private double distance;
	private final double MAX_SPEED = 125.0;
	
	public Car(String color){
		this.color = color;
		this.speed = 0.0;
		}
	public String getColor() {
		return this.color;
	}

	public double getMaxSpeed() {
		return MileTokillo(MAX_SPEED);
	}

	public double getSpeed() {

		return this.speed;
	}
	public boolean speedUp(double speed) {
		if (this.speed + speed > 0 && this.speed + speed < getMaxSpeed()) {
			this.speed += speed;
			return true;
		} else
			return false;

	}
	public double killoToMile(double distance) {
		this.distance = distance/1.6;
		return this.distance;
		
	}
	public double MileTokillo(double distance) {
		this.distance = distance*1.6;
		return this.distance;
	}
	
	
}
public class 과제10_2 {

	public static void main(String[] args) {
		Car myCar = new Car("red");

		System.out.println("myCar의 색: " + myCar.getColor());
		System.out.println("차의 최대 속력: " + myCar.getMaxSpeed() + "km/h");

		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if (myCar.speedUp(100.0))
			System.out.println("속도 변경 가능, 현재 차의 속력: " + myCar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경 불가능, 현재 차의 속력: " + myCar.getSpeed() + "km/h");

		System.out.print("두 번째 speedUp(90.0km/h): ");
		if (myCar.speedUp(90.0))
			System.out.println("속도 변경 가능, 현재 차의 속력: " + myCar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경 불가능, 현재 차의 속력: " + myCar.getSpeed() + "km/h");

		Car yourCar = new Car("blue");

		System.out.println("\nyourCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력: " + myCar.getMaxSpeed() + "km/h");

		System.out.print("첫 번째 speedUp(-100.0km/h): ");
		if (yourCar.speedUp(-100.0))
			System.out.println("속도 변경 가능, 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경 불가능, 현재 차의 속력: " + yourCar.getSpeed() + "km/h");

		System.out.print("두 번째 speedUp(210.0km/h): ");
		if (yourCar.speedUp(210.0))
			System.out.println("속도 변경 가능, 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경 불가능, 현재 차의 속력: " + yourCar.getSpeed() + "km/h");

	}

}
