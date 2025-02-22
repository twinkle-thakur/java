package Questions;

import java.util.Scanner;

public class Q_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int a=sc.nextInt();
		Boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
				break;
						}
					}
		if(b) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
		sc.close();
	}

}
