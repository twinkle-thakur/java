package Ifelse;

import java.util.Scanner;

public class Sideoftriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st side of triangle");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("enter 2nd side of triangle");
int a2=sc.nextInt();
System.out.println(a2);
System.out.println("enter 3rd side of triangle");
int a3=sc.nextInt();
System.out.println(a3);
if((a+a2)>a3&&(a+a3)>a2&&(a2+a3)>a)//1`koi bhi 2 side ka sum bada hona chahiye 3rd side se then valid triangle
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
