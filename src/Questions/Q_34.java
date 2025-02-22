package Questions;

public class Q_34 {

	public static void main(String[] args) {
		int a[]= {1,4,6,32,5,67,89,2};
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(a[a.length-2]);
			
	}

}
