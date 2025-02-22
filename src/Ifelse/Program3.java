package Ifelse;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	int quantity;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  purchased quantity of item");
	quantity=sc.nextInt();
	System.out.println(quantity);
	int cost=100;
	
	
	if(quantity>=1000)
	{
		int  totalcost=quantity*cost;
		double discount= 0.1*totalcost;
		
		System.out.println("10% discount on ur purchase is :");
		System.out.println(totalcost-discount);
	}
	else
	{
		 int totalcost = quantity*cost;
		System.out.println(totalcost);
	}
	sc.close();
	}

}
