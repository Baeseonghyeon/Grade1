
public class insertsort {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,61,24,40};
		int i=a.length-1;
		
		for(int k=0;k<a.length;k++) {
			int p=k;
			for(int j=k;j<=i;j++) {
			if(a[j]<a[p]) {
				p=j;
			}
		}
			int temp=a[k];
			a[k]=a[p];
			a[p]=temp;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
