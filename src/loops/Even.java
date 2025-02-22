package loops;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		System.out.println("even no. b/n 0 - "+n+" are  ");

		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);

			}
		}
sc.close();
	}

}
