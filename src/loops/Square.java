package loops;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr row");
		int a=sc.nextInt();
		System.out.println("enetr column");
		int b=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
