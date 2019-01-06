package Hw10;

class Consumer implements Runnable{
	private Table table;
	public Consumer(Table drop) {
		this.table=drop;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				int cake =table.get();
				System.out.println("소비자: "+cake+"번 케익을 소비하였습니다.");
				Thread.sleep((int)(Math.random()*1000.0));
			}catch (InterruptedException e) {}
		}
	}

}
