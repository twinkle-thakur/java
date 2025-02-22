package Ifelse;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st  angle of triangle");
		int a=sc.nextInt();
		System.out.println(a);

		System.out.println("enter 2nd angle");
int a2=sc.nextInt();
System.out.println(a2);
System.out.println("enter 3rd angle ");
int a3=sc.nextInt();
System.out.println(a3);
int sum=a+a2+a3;
		
if(sum==180)
{
	System.out.println("valid triangle");

}
else
{
	System.out.println("invalid");

}
sc.close();
	}

}
