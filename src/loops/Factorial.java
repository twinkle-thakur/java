package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of no. whose factorial has to be calculated ");
		int n=sc.nextInt();
		System.out.println(n);
		int fact=1;
for(int i=1;i<=n;i++)
	fact =i*fact;
System.out.println("the factorial of "+n+" is :"+fact);
sc.close();
	}

}
