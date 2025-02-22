package Ifelse;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr salary");
	int salary=sc.nextInt();
	System.out.println(salary);
	System.out.println("enter year of service");
	int year=sc.nextInt();
	System.out.println(year);
	if(year>=5)
	{
		System.out.println("your 5% bonus is");
		double bonus=0.5*salary;
		double total=bonus+salary;
		System.out.println(bonus);
		System.out.println("total salary");
		System.out.println(total);
	}
	else
	{
		System.out.println(salary);
	}
	sc.close();
	}

}
