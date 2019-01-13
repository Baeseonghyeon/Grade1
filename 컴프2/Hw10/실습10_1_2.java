package Hw10;

public class 실습10_1_2 {
	public static void main(String args[]) throws InterruptedException {
		long start=System.currentTimeMillis();
		Runnable evenSum=new Runnable() {
			
			@Override
			public void run() {
				long evenSum=0;
				for(long l=Integer.MIN_VALUE;l<=Integer.MAX_VALUE;l++)
					if(l%2==0)
						evenSum+=l;
				System.out.println("evenSum: "+evenSum);
			}
		};
		Runnable oddSum=new Runnable() {
			
			@Override
			public void run() {
				long oddSum=0;
				for(long l=Integer.MIN_VALUE;l<=Integer.MAX_VALUE;l++)
					if(l%2!=0)
						oddSum+=l;
				System.out.println("oddSum: "+oddSum);
			}
		};
		Thread t1 =new Thread(evenSum);
		Thread t2 =new Thread(oddSum);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		long end=System.currentTimeMillis();
		System.out.println("실행시간: "+(end+start)/1000.0+"초");
	}
}
