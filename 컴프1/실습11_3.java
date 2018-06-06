public class 실습11_3 {

	public static void main(String[] args) {
		int[] oneDArray = {1,2,3};
		int[][] twoDArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		addOneDArr(oneDArray,100);
		addTwoDArr(twoDArray, 100);
		System.out.println("1차원 int 배열");
		for(int i:oneDArray) 
			System.out.print(i +"\t");
			System.out.print("\n\n");
			
		System.out.println("2차원 int 배열");
		for(int i=0;i<twoDArray.length;i++) {
			for(int k:twoDArray[i]) {
				System.out.print(k+"\t");
			}
			System.out.print("\n");
			
		}
		
	}
	
	
	
	
	
	public static void addOneDArr(int[] oneDArr, int num) {
		for(int i=0;i<oneDArr.length;i++) {
			oneDArr[i]+=num;
		}
	}
	
	public static void addTwoDArr(int[][] twoDArr, int num) {
		for(int i=0;i<twoDArr.length;i++) {
			for(int j=0;j<twoDArr[i].length;j++) {
				twoDArr[i][j]+=num;
			}
		}
	}
	
}
