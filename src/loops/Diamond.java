package loops;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of  * ");
		int a=sc.nextInt();
		
				for(int i=1;i<=a;i++)
		{
			for(int j=a-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=a-1;i>0;i--)
		{
			for(int j=a-2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>0;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
