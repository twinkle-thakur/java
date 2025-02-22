package Ifelse;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println(a);
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println(b);
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
		sc.close();
	}

}
