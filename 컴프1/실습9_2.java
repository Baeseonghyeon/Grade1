class Calc{


	double average(double...d) {
		double sum =0;
		for(double i: d) {
			sum += i;
		}
		double A = sum/d.length;
		return A;
	}
}
public class �ǽ�9_2 {

	public static void main(String[] args) {
		Calc obj1 = new Calc();
		System.out.println(obj1.average(2.0,3.0));
		System.out.println(obj1.average(1.1,2.2,3.3));
		System.out.println(obj1.average(3.0,5.0,5.5,7.7));
	}

}
