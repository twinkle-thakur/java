//i/p=6--->1,2,3,4,5(no. smaller than 6)

//complete divisor of 6--1,2,3
//6=1+2+3(sum of its divisors)--->perfect no.
package Youtube;

import java.util.Scanner;

public class Perfectno21 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	System.out.println("enter no.");
	int a=sc.nextInt();
	int sum=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum+=i;
		}
	}
	if(a==sum) {
		System.out.println(a+" is perfect no. ");
	}
	else
		System.out.println(a+" is not perfect no. ");
	sc.close();
	}

}
