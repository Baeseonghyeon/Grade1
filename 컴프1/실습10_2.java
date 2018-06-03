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

public class 실습10_2 {

	public static void main(String[] args) {
		Plane plane1 = new Plane("보잉", "보잉 747", 450);
		System.out.println("제조사: " + plane1.getManufacturer());
		System.out.println("모델명: " + plane1.getModel());
		System.out.println("최대 승객수: " + plane1.getMaxNumOfPassengers() + "\n");

		Plane plane2 = new Plane("보잉", "보잉 777", 500);
		System.out.println("제조사: " + plane2.getManufacturer());
		System.out.println("모델명: " + plane2.getModel());
		System.out.println("최대 승객수: " + plane2.getMaxNumOfPassengers() + "\n");

		Plane plane3 = new Plane();
		plane3.setManufacturer("록히드 마틴");
		plane3.setModel("F-22");
		plane3.setMaxNumOfPassengers(-10); // 잘못된 값을 입력하면?

		System.out.println("제조사: " + plane3.getManufacturer());
		System.out.println("모델명: " + plane3.getModel());
		System.out.println("최대 승객수: " + plane3.getMaxNumOfPassengers() + "\n");

		System.out.println("생산된 비행기의 수: " + Plane.getNumOfPlanes());
	}

}
