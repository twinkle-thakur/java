package Questions;

import java.util.Scanner;

public class Q_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		if(a>=0) {
			int s=(int)Math.sqrt(a);
			if(s*s==a) {
				System.out.println("perfect square no. ");
			}
			else
				System.out.println("not");
		}sc.close();
	}

}
