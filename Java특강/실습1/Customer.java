package 실습1;

class Customer{
	String name;
	int totalSalary;
	int totalSavings;
	String email;
	public Customer(String name,int totalSalary,int totalSavings,String email) {
		this.name=name;
		this.totalSalary=totalSalary;
		this.totalSavings=totalSavings;
		this.email=email;
	}
	public String toString() {
		return String.format(this.name,this.totalSalary,this.totalSavings,this.email);
	}
}
