package Questions;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num :");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("positive no.");
		}
		else if(a<0) {
			System.out.println("negative no.");
		}
		else
			System.out.println("zero");
		sc.close();
	}

}
