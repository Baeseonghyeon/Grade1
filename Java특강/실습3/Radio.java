package 실습3;

public class Radio extends Controller{
	boolean power;
	public Radio(boolean x) {
	this.power=x;	
	}
	public void show() {
		if(power==true) {
			System.out.println("라디오가 켜졌습니다.");
		}
		else System.out.println("라디오가 꺼졌습니다.");
	}
	String getName() {
		return null;
	}
}
