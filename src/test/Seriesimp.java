package test;

import java.util.Scanner;

public class Seriesimp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b and n :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int c=0;
			int ans=0;
			for(int j=0;j<=i;j++) {
				c=(int) (c+(Math.pow(2, j)*b));
			}
			 ans=a+c;
			System.out.print(ans);
		}
	}

}
