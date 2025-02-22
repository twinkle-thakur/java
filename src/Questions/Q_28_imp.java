package Questions;

import java.util.Scanner;

public class Q_28_imp {
//fib series-->0,1,1,2,3,5,8,13,21,34...
//if (5*n*n + 4)or(5**n*n - 4) is a perfect square then that no. is fibonaci no. 	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr no.");
		int num=sc.nextInt();
		int a1=(5*num*num)+4;
		int a2=(5*num*num)-4;
		int s1=(int)Math.sqrt(a1);
		int s2=(int)Math.sqrt(a2);
		if(a1==s1*s1||a2==s2*s2) {
			System.out.println("fibonacci no.");
		}
		else
			System.out.println("not a fibonacci no.");
		sc.close();
	}

}
