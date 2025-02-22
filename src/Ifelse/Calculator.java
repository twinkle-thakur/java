package Ifelse;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter num 1 op^n num 2 :");
		Scanner sc=new Scanner(System.in);
		double d1=sc.nextDouble();
		char c=sc.next().charAt(0);
		double d2=sc.nextDouble();
		
		if(c=='+') {
			System.out.println(d1+d2);
		}
		else if(c=='-') {
			System.out.println(d1-d2);
		}
		else if(c=='*') {
			System.out.println(d1*d2);
		}
		else if(c=='/') {
			System.out.println(d1/d2);
		}
		else if(c=='%') {
			System.out.println(d1%d2);
		}
	}

}
