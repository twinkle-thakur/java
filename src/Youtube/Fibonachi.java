package Youtube;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter term");
		int term=sc.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<term;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			
			b=c;
		}sc.close();
	}

}
