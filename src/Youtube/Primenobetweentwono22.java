/*prime no b/n 2 no.*/
//1st no=10
//2nd no=20
//prime no b/n 10&20--->11,13,17,19
package Youtube;

import java.util.Scanner;

public class Primenobetweentwono22 {
	public static void main(String[] args) {
		int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st no.");
	int a=sc.nextInt();
	System.out.println("enter 2nd no.");
	int b=sc.nextInt();
	for (i=a;i<=b;i++) {
		for( j=2;j<=i;j++) {
			if(i%j==0) 
				break;
		}
		if(i==j) 
			System.out.print(j+" ");
		
	}sc.close();
	}

}
