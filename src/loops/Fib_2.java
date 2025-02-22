package loops;

import java.util.Scanner;

public class Fib_2 {
    public static void fib(int num) {
    	if(num<0) return;
    	if(num==0)return;
    	System.out.print("0 ");
    	System.out.print("1 ");
    	int first=0,second=1;
    	while(first+second<=num) {
    		int third=first+second;
    		System.out.print(third+" ");
    		first=second;
    		second=third;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int num=sc.nextInt();
		fib(num);
	}

}
