package loops;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("enter no.");
			int data=sc.nextInt();
			sum=sum+data;
		}
		System.out.println(sum);
		double a=sum/10;
		System.out.println("average is: ");
		System.out.println(a);
		sc.close();
	}

}
