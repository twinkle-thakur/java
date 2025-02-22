package Ifelse;

import java.util.Scanner;

public class Isitpositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. : ");
		int a=sc.nextInt();
		System.out.println(a);
		if(a>0)
		{
			System.out.println("positive");
		}
		else if(a<0)
		{
			System.out.println("negative");
		}
		else
			{
				System.out.println("equal to 0");
			}
		sc.close();
		}
	}


