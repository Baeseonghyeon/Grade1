package Hw10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Table{
	private ReentrantLock block=new ReentrantLock();
	private Condition blockCond1;
	private int cake;
	private boolean empty=true;
	
	public Table() {
		blockCond1= block.newCondition();
	}
	public int get() throws InterruptedException{
		block.lock();
		try {
			while(empty)
				blockCond1.await();
			empty=true;
			blockCond1.signal();
			return cake;
		}finally {
			block.unlock();
		}
	}
	public void put(int cake) throws InterruptedException{
		block.lock();
		try {
			while(!empty)
				blockCond1.await();
			this.cake=cake;
			empty=false;
			blockCond1.signal();
		}finally {
			block.unlock();
		}
	}
}