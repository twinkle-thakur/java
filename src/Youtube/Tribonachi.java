package Youtube;

import java.util.Scanner;

public class Tribonachi {//add of last 3 no.-->0,1,2,3,6

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr term");
		int term=sc.nextInt();
		int a=0,b=1,c=2,d;
		for(int i=0;i<term;i++) {
			System.out.print(a+" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}

}
