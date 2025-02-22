package test;

public class Palindrome {
    static boolean isPalindrome(int n) {
    	int rev=0;
    	for(int i=n;i>0;i=i/10) {
    		int sum=i%10;
    		rev=rev*10+sum;
    	}
		return n==rev;
    	
    }
	public static void main(String[] args) {
		if(isPalindrome(1214)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
