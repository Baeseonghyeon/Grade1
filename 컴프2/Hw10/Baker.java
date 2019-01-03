package Hw10;

class Baker implements Runnable{
	private Table table;
	
	public Baker(Table table) {
		this.table=table;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				table.put(i);
				System.out.println("제빵사: "+i+"번 케익을 생산하였습니다.");
				Thread.sleep((int)(Math.random()*1000.0));
			}catch(InterruptedException e) {}
		}
	}
	

}
