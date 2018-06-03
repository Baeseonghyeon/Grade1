class Plane {
	private String manufacturer;
	private String model;
	private int maxNumOfPassengers;
	public static int numOfPlanes = 0;

	public Plane() {
		this(null, null, 0);
	}

	public Plane(String manufacturer, String model, int maxNumOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumOfPassengers = maxNumOfPassengers;
		numOfPlanes++;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;

	}

	public void setModel(String model) {
		this.model = model;

	}

	public void setMaxNumOfPassengers(int maxNumOfPassengers) {
		if (maxNumOfPassengers > 0) {
			this.maxNumOfPassengers = maxNumOfPassengers;
		}else {
			this.maxNumOfPassengers=0;
		}

	}

	public String getManufacturer() {

		return this.manufacturer;
	}

	public String getModel() {

		return this.model;
	}

	public int getMaxNumOfPassengers() {

		return this.maxNumOfPassengers;
	}

	public static int getNumOfPlanes() {
		return numOfPlanes;
	}

}

public class �ǽ�10_2 {

	public static void main(String[] args) {
		Plane plane1 = new Plane("����", "���� 747", 450);
		System.out.println("������: " + plane1.getManufacturer());
		System.out.println("�𵨸�: " + plane1.getModel());
		System.out.println("�ִ� �°���: " + plane1.getMaxNumOfPassengers() + "\n");

		Plane plane2 = new Plane("����", "���� 777", 500);
		System.out.println("������: " + plane2.getManufacturer());
		System.out.println("�𵨸�: " + plane2.getModel());
		System.out.println("�ִ� �°���: " + plane2.getMaxNumOfPassengers() + "\n");

		Plane plane3 = new Plane();
		plane3.setManufacturer("������ ��ƾ");
		plane3.setModel("F-22");
		plane3.setMaxNumOfPassengers(-10); // �߸��� ���� �Է��ϸ�?

		System.out.println("������: " + plane3.getManufacturer());
		System.out.println("�𵨸�: " + plane3.getModel());
		System.out.println("�ִ� �°���: " + plane3.getMaxNumOfPassengers() + "\n");

		System.out.println("����� ������� ��: " + Plane.getNumOfPlanes());
	}

}
