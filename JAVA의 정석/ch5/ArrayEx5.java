package ch5;

class ArrayEx5 {

	public static void main(String[] args) {
		int sum =0;
		float average=0;
		
		int[] score = {100,80,100,88,90};
		
		for(int i:score) {
			sum+=i;
		}
		average = sum/(float)score.length;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average );
	}

}
