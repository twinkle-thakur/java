package Questions;

import java.util.Scanner;

public class Q_35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr any no.");
		int n=sc.nextInt();
		Boolean b=true;
		for(int i=n;i>1;i=i/2) {
			int r=i%2;
			if(r!=0) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println(n+" is in power of 2");
		}
		else
			System.out.println(" not ");
	}

}
