package loops;

import java.util.Scanner;

public class Lcm_Of_2_no {
    public static int lcm(int a,int b) {
    	int l=(a>b)?a:b;
    	while(true) {
    	if(l%a==0&&l%b==0) {
    		return l;
    	}
    	l++;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.1 ");
		int a=sc.nextInt();
		System.out.println("enter no.2 ");
		int b=sc.nextInt();	
		System.out.println("lcm of "+a+" and "+b+" is "+lcm(a,b));
	}

}
