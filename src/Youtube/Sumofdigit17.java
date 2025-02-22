package Youtube;

import java.util.Scanner;

public class Sumofdigit17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		int sum=0;
		for(int i=a;i>0;i=i/10) {
			int digit=i%10;
			sum=sum+digit;
		}
		System.out.println("sum of the digit "+a+" is "+sum);
		sc.close();
	}

}
