
public class binarysearch {
	public static int search(int[] a,int n){
		int start=0;
		int end=a.length-1;
		int p=(start+end)/2;
		while(true) {
			if(n==a[p]) {
				return p;
			}else if(n>a[p]){
				start=p;
				p=(start+end)/2;
			}else {
				end=p;
				p=(start+end)/2;
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		System.out.println(search(a,4));
	}

}
