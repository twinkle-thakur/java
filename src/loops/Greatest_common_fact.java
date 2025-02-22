package loops;

import java.util.Scanner;

public class Greatest_common_fact {
    public static int Gcd(int a,int b){
    	int g=(a<b)?a:b;
    	while(g>0) {
    		if(a%g==0&&b%g==0) {
    			return g;
    		}
    		g--;
    	}
		return 0;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.1 ");
		int a=sc.nextInt();
		System.out.println("enter no.2 ");
		int b=sc.nextInt();	
		System.out.println("gcd of "+a+" and "+b+" is "+Gcd( a,b));
		
	}

}
