package Ifelse;

import java.util.Scanner;

public class Program7{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of classes held");
		double held=sc.nextInt();
		System.out.println(held);
		System.out.println("enter classes attended");
		double a=sc.nextInt();
		System.out.println(a);
		double p= a/held*100;
		System.out.println("percentage of classes attended");
		System.out.println(p);
		System.out.println("enter medical cause");
		String s=sc.next();
		System.out.println(s);
		if(p>=75||s.equals("yes"))
		{
			System.out.println("allowed to sit");
		}
		else
		{
			System.out.println("not allowed");
		}
		sc.close();
	}

}
