package Youtube;

import java.util.Scanner;

public class Prime20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println(a +" is  prime no.");
		}
		else {
			System.out.println(a+" is not prime no.");}
		sc.close();
	}

}
