package Youtube;

import java.util.Scanner;

public class Palindrome18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		for(int i=a;i>0;i=i/10) {
			int r=i%10;
			sum=sum*10+r;
		}
		if(b==sum) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		sc.close();
	}

}
