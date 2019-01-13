package Hw10;

public class 실습10_1 {
	public static void main(String args[]) {
		long startTime=System.currentTimeMillis();
		
		long evenSum=0;
		for(long l=Integer.MIN_VALUE;l<=Integer.MAX_VALUE;l++)
			if(l%2==0)
				evenSum+=l;
		System.out.println("evenSum: "+evenSum);
		
		long oddSum=0;
		for(long l=Integer.MIN_VALUE;l<=Integer.MAX_VALUE;l++)
			if(l%2!=0)
				oddSum+=l;
		System.out.println("oddSum: "+oddSum);
		
		long endTime=System.currentTimeMillis();
		System.out.println("실행시간: "+(endTime-startTime)/1000.0+"초");
	}
}
