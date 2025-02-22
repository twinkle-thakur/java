package Ifelse;

import java.util.Scanner;

public class Youngestofall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age of ram");
		int ram=sc.nextInt();
		System.out.println(ram);
		System.out.println("enter  age of  shyam");
		int shyam=sc.nextInt();
		System.out.println(shyam);
		System.out.println("enter  age of  ajay");
		int ajay=sc.nextInt();
		System.out.println(ajay);
if(ram<shyam&&ram<ajay)
{
	System.out.println("ram is youngest");

}
else if(shyam<ajay)
{
	System.out.println("shyam is youngest");

}
else
{
	System.out.println("ajay is youngest");

}

sc.close();
	}

}
