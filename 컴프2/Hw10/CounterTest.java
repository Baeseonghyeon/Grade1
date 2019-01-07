package Hw10;
class Counter2{
	private int value=0;
	public synchronized void  increment() {value++;}
	public synchronized void decrement() {value--;}
	public synchronized void printCounter() {System.out.println(value);}
}
class MyThread2 extends Thread{
	Counter2 sharedCounter;
	public MyThread2(Counter2 c) {
		this.sharedCounter=c;
	}
	public void run() {
		int i=0;
		while(i<20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			if(i%40==0)
				sharedCounter.printCounter();
			try {
				sleep((int)(Math.random()*2));
			}catch(InterruptedException e) {}
			i++;
		}
	}
}
public class CounterTest {

	public static void main(String[] args) {
		Counter2 c=new Counter2();
		new MyThread2(c).start();
		new MyThread2(c).start();
		new MyThread2(c).start();
		new MyThread2(c).start();
		

	}

}
