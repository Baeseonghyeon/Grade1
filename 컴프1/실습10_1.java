
class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		hour =0;
		minute = 0;
		second= 0;
		
	}
	public Time(int hour,int minute,int second) {
		this.hour=(hour>=0)&&(hour<60)?hour:0;
		this.minute=(minute>=0)&&(minute<60)?minute:0;
		this.second=(second>=0)&&(second<60)?second:0;
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
	}
}
public class 실습10_1 {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자 호출 후 시간: " + time1);
		Time time2 = new Time(22,15,48);
		System.out.println("기본 생성자 호출 후 시간: " + time2);
		Time time3 = new Time(15,66,77);
		System.out.println("기본 생성자 호출 후 시간: " + time3);
	}

}
