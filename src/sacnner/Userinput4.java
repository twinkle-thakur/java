package sacnner;

import java.util.Scanner;

public class Userinput4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("enter your no. ");
		long no = sc.nextLong();
		System.out.println(no);
		System.out.println("enter your name ");
		sc.nextLine();//reads whole line until we press enter
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("enter your adderess");
		//sc.nextLine(); if we write 
		String add = sc.nextLine();
		System.out.println(add);
		sc.close();
	}

}
