package Questions;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age :");
		int age=sc.nextInt();
		String s=age>=18?"eligible for vote":"not eligible";
		System.out.println(s);
		sc.close();
	}

}
