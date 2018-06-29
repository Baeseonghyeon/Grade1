package 실습1;

class Accountant{
	int tax=0;
	Customer List[]=new Customer[10];
	int num=0;
	int a=0;
	public void taxCalculator(Customer c) {
		if(c.totalSavings>=3000) {
			c.totalSavings=3000;
		}
		if(c.totalSalary<=1000) {tax =0;}
		else if(c.totalSalary>=1000||c.totalSalary<=3000) {
			if(c.totalSalary/10-c.totalSavings<=0) {
				tax = 0;
			}
			else tax=c.totalSalary/10-c.totalSavings;
			}
		else if(c.totalSalary>=3000||c.totalSalary<=6000) {
			if(c.totalSalary/20-c.totalSavings<=0) tax=0;
			else tax= c.totalSalary/20-c.totalSavings;
		}
		else if(c.totalSalary>=6000) {
			if(c.totalSalary/30-c.totalSavings<=0) tax=0;
			else tax= c.totalSalary/30-c.totalSavings;
		}
		System.out.println(tax);
	}
	public void addCustomer(Customer c) {
		List[num] = c;
		num++;
	}
	public void delCustomer(int num) {
		List[num]=null;
	}
	public void findCustomer(String name) {
		if(List[a].name.equals(name)) {
			System.out.println(List[a]);
			a=0;
		}
		else {
			a++;
			findCustomer(name);
		}
	}
}
