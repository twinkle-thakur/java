package Ifelse;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no.");
		float f=sc.nextFloat();
		System.out.println(f);

		float r=f*1000;
		System.out.println(r);
        r=Math.round(r);
		System.out.println(r);

		System.out.println("enter 2nd no.");
		float f2=sc.nextFloat();
		System.out.println(f2);
		float r2=f2*1000;
		System.out.println(r2);
        r2=Math.round(r2);
		System.out.println(r2);
if(r==r2)
{
	System.out.println("both no. are same upto 3 decimal places");

}
else
{
	System.out.println("not equal");

}sc.close();
	}

}
