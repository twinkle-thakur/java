package practice;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		System.out.println("enter size of array");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int arr[]=new int[a];
	System.out.print("entered array is ");
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
		System.out.print(arr[i]);		
	}
	
	}

}
