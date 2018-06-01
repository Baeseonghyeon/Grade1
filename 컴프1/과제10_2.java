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
public class ����10_2 {

	public static void main(String[] args) {
		Car myCar = new Car("red");

		System.out.println("myCar�� ��: " + myCar.getColor());
		System.out.println("���� �ִ� �ӷ�: " + myCar.getMaxSpeed() + "km/h");

		System.out.print("ù ��° speedUp(100.0km/h): ");
		if (myCar.speedUp(100.0))
			System.out.println("�ӵ� ���� ����, ���� ���� �ӷ�: " + myCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ���� �Ұ���, ���� ���� �ӷ�: " + myCar.getSpeed() + "km/h");

		System.out.print("�� ��° speedUp(90.0km/h): ");
		if (myCar.speedUp(90.0))
			System.out.println("�ӵ� ���� ����, ���� ���� �ӷ�: " + myCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ���� �Ұ���, ���� ���� �ӷ�: " + myCar.getSpeed() + "km/h");

		Car yourCar = new Car("blue");

		System.out.println("\nyourCar�� ��: " + yourCar.getColor());
		System.out.println("���� �ִ� �ӷ�: " + myCar.getMaxSpeed() + "km/h");

		System.out.print("ù ��° speedUp(-100.0km/h): ");
		if (yourCar.speedUp(-100.0))
			System.out.println("�ӵ� ���� ����, ���� ���� �ӷ�: " + yourCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ���� �Ұ���, ���� ���� �ӷ�: " + yourCar.getSpeed() + "km/h");

		System.out.print("�� ��° speedUp(210.0km/h): ");
		if (yourCar.speedUp(210.0))
			System.out.println("�ӵ� ���� ����, ���� ���� �ӷ�: " + yourCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ���� �Ұ���, ���� ���� �ӷ�: " + yourCar.getSpeed() + "km/h");

	}

}
