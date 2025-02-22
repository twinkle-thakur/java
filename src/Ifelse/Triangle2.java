package Ifelse;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st side of triangle");
int a=sc.nextInt();
System.out.println(a);
System.out.println("enter 2nd side of triangle");
int b=sc.nextInt();
System.out.println(b);
System.out.println("enter 3rd side of triangle");
int c=sc.nextInt();
System.out.println(c);
if(a==b&&a==c&&b==c)
{
	System.out.println("equilateral triangle");

}
else if(a==b||b==c||c==a)
{
	System.out.println("isoceles");

}
else
{
	System.out.println("scaler triangle");

}sc.close();
	
	}

}
