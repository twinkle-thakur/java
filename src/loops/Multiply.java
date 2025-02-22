package loops;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		int mul=1;
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter no. ");
			int data =sc.nextInt();
			mul=mul*data;
		}
		System.out.println(mul);
	sc.close();
	}
	
}
