package practice;

import java.util.Scanner;

public class Inverted2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. stars");
		int a=sc.nextInt();
		    for(int i=1;i<=a;i++) {
			for(int j=a-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
