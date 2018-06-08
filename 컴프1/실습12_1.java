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
		return String.format("이름:%s,나이: %d", this.name,this.age);
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
		return super.toString()+", 전공:"+this.major;
	}
	
	
}
public class 실습12_1 {

	public static void main(String[] args) {
		
		Human man = new Human("Steve", 30);
		System.out.println(man);
		
		Student std= new Student("Parker", 23, "Physics");
		System.out.println(std);
		
		// private 필드로 선언되 있는 부모클래스의 필드를 상속받은 setter로 변경 할수 있는가?
		std.setName("Peter");
		std.setAge(19);
		std.setMajor("Computer Science");
		
		System.out.print("이름: " + std.getName());
		System.out.print(", 나이: " + std.getAge());
		System.out.print(", 전공: " + std.getMajor());


	}

}
