package loops;

import java.util.Scanner;

public class Fibonachiseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fibonachi series");
		int x=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=x;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}

}
