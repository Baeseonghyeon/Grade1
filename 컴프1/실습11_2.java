public class 실습11_2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 10, 20, 50, -10, 333, -2345, -8859, 100, 5, 111 };
		System.out.println("최솟값: " + minValue(array));
		System.out.println("최대값: " + maxValue(array));
	}
	
	public static int minValue(int[] arr) {
		int MIN;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		MIN = arr[arr.length - 1];
		return MIN;
	}
	
	
	public static int maxValue(int[] arr) {
		int MAX;
		int temp=arr[0];
		for(int i : arr) {
			if(temp<i) {
				temp=i;
			}
		}
		MAX = temp;
		return MAX;
	}
	
}
