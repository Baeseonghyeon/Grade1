class Human{
	String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return String.format("�̸�:%s,����: %d", this.name,this.age);
	}
}
class Student extends Human{
	String major;
	
	public Student(String name, int age,String major) {
		super(name, age);
		this.major=major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor(){
		return this.major;
	}
	@Override
	public String toString() {
		return super.toString()+", ����:"+this.major;
	}
	
	
}
public class �ǽ�12_1 {

	public static void main(String[] args) {
		
		Human man = new Human("Steve", 30);
		System.out.println(man);
		
		Student std= new Student("Parker", 23, "Physics");
		System.out.println(std);
		
		// private �ʵ�� ����� �ִ� �θ�Ŭ������ �ʵ带 ��ӹ��� setter�� ���� �Ҽ� �ִ°�?
		std.setName("Peter");
		std.setAge(19);
		std.setMajor("Computer Science");
		
		System.out.print("�̸�: " + std.getName());
		System.out.print(", ����: " + std.getAge());
		System.out.print(", ����: " + std.getMajor());


	}

}
