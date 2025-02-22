package Ifelse;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println(age);
		System.out.println("enter sex M/F");
		String c=sc.next();
		System.out.println(c);
		System.out.println("enter martial status i.e: yes/no");
		String s=sc.next();
		System.out.println(s);
		if(s.equals("female"))
		{
			System.out.println("she will work in urban areas");
		}
		else if(age>=20&&age<40&&c.equals("male"))
		{
			System.out.println("he may work anywhere");
		}
		else if(age>=40&&age<=60&&c.equals("male"))
		{
			System.out.println("he will work in urban areas only");
		}
		else
		{
			System.out.println("error");
		}
		sc.close();
	}

}
