package 실습3;

class Tv extends Controller{
	boolean power;
	public Tv(boolean x) {
	this.power=x;	
	}
	public void show() {
		if(power==true) {
			System.out.println("Tv가 켜졌습니다.");
		}
		else System.out.println("Tv가 꺼졌습니다.");
	}
	String getName() {
		return null;
	}
}
