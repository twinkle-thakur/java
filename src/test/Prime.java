package test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. :");
		int a=sc.nextInt();
		boolean check=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				check=false;
				break;
			}
		}
		if(check)
		{
			System.out.println("prime no. ");
		}
		else
		{
			System.out.println("not prime ");
		}
		sc.close();
	}

}
