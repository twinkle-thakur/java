package Youtube;

import java.util.Scanner;

public class Reverse16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		System.out.println("reverse of "+a+" is :");
		for(int i=a;i>0;i=i/10) {
			int digit=i%10;
			 System.out.print(digit);
		}
		sc.close();
	}

}
