package Ifelse;

import java.util.Scanner;

public class Greaterof3no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println(b);
		System.out.println("enter c : ");
		int c=sc.nextInt();
		System.out.println(c);
		if(a>b&&a>c)
		{
			System.out.println(a+ " is greater");
		}
		
		else if(b>c)
		{
			System.out.println(b+ "is greater ");
		}
		 else
		 {
			 System.out.println(c+"is greater");
		 }
		sc.close();
	}

}
