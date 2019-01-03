package Hw10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BakerConsumerTest {

	public static void main(String[] args) {
		Table table =new Table();
		(new Thread(new Baker(table))).start();
		(new Thread(new Consumer(table))).start();
	}

}
