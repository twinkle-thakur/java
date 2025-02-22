package Ifelse;

import java.util.Scanner;

public class Program3P {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter character");
		char c=sc.next().charAt(0);
		System.out.println(c);
		if((c>='a'&&c<='z')||(c>='A'&&c<='B'))
		{
			System.out.println("alphabet");
	
		}
		else if(c>='0'&&c<='9')
		{
			System.out.println("digit");
	
		}
		else
		{
			System.out.println("special character");

		}
		sc.close();
	}

}
