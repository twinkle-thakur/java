package Ifelse;

import java.util.Scanner;

public class Program8{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char c=sc.next().charAt(0);
		System.out.println(c);
		if(c<=65&&c<97)
		{
			System.out.println("upper case");
		}
		else if(c>=97)
		{
			System.out.println("lower case");
		}
		sc.close();
	}

}
