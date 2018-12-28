package Hw06;

import java.util.*;

public class 실습6_3 {

	public static void main(String[] args) {
		Lotto L=new Lotto();
		ArrayList<Integer> a=L.getPrize();
		System.out.println(a);

	}

}
class Lotto{
	private LinkedList<Integer> lottoBalls;
	private ArrayList<Integer> prizeNumber;
	
	public Lotto() {
		lottoBalls =new LinkedList<>();
		prizeNumber=new ArrayList<>(6);
		for(int i=1;i<=45;i++) {
			lottoBalls.add(i);
		}
		Collections.shuffle(lottoBalls);
		for(int i=0;i<6;i++) {
			prizeNumber.add(lottoBalls.get(i));
		}
	}
	public ArrayList<Integer> getPrize(){
		Collections.sort(this.prizeNumber);
		return this.prizeNumber;
	}
}
