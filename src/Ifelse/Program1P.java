package Ifelse;

import java.util.Scanner;

public class Program1P {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char c=sc.next().charAt(0);
		System.out.println(c);
		

		if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
		{
			System.out.println("it is alphabet");
	
		}
		else
		{
			System.out.println("wrong choice");

		}
		sc.close();
	}

}

