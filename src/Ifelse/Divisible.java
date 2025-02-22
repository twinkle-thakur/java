package Ifelse;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int a=sc.nextInt();
		System.out.println(a);
		if(a%5==0&&a%11==0)
		{
			System.out.println(a +" is divisible by 5 and 11");
		}
		else
		{
			System.out.println("not divisible");
		}
		sc.close();
	}

}
