package Questions;

import java.util.Scanner;

public class Q_31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int a=sc.nextInt();
		int count =0;
		int sum=0;
		for(int i=a;i>0;i=i/10) {
			count++;
		}
		for(int i=a;i>0;i=i/10) {
			int r=i%10;
			sum+=(int)Math.pow(r, count);
					}
		if(a==sum) {
			System.out.println("armstrong no ");
		}
		else
			System.out.println("not");
		sc.close();
	}

}
