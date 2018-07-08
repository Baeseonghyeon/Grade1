package ch5;

class ArrayEx6 {

	public static void main(String[] args) {
		int[] score= {100,80,60,45,35,70,56};
		int max=score[0];
		int min=score[0];
		
		for(int i:score) {
			if(i>max) {
				max=i;
			}
			else if(i<min) {
				min=i;
			}
		}
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
	}

}
