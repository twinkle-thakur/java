package Youtube;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i]);
		}
		System.out.println("enter location where element is to be deleted");
		int loc=sc.nextInt();
		for(int i=loc;i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}sc.close();
		}

}
