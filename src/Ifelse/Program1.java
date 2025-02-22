package Ifelse;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		l = sc.nextInt();
		
		System.out.println("enter breadth");
		b = sc.nextInt();
		
		if(l==b)
		{
			System.out.println("it is square");
		}
		else
		{
			System.out.println("rectangle");
		}
		sc.close();
	}

}
