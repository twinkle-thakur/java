package loops;

import java.util.Scanner;

public class Palindrome_2 {
	 public static boolean isPalindrome(int num) {
		   int reverse=reverse(num);
		  
		  return num==reverse;
		  }
	   public static int reverse(int num) {
		   int rev=0;
		   while(num>0) {
			   int digit=num%10;
			    rev=rev*10+digit;
			    num/=10;
		   }
		   return rev;
	   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int num=sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println("your no is palindrome no");
		}
		else
			System.out.println("not palindrome");
	}

}
