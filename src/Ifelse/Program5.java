package Ifelse;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		System.out.println( marks);
		if(marks<=25)
		{
			System.out.println("grade F");
		}
		else if(marks>25&&marks<=45)
		{
			System.out.println("grade E");	
		}
		else if(marks>45&&marks<=50)
		{
			System.out.println("grade D");	
		}
		else if(marks>50&&marks<=60)
		{
			System.out.println("grade C");	
		}
		else if(marks>60&&marks<=80)
		{
			System.out.println("grade B");	
		}
		else if(marks>80)
		{
			System.out.println("grade A");	
		}
		sc.close();
	}

}
