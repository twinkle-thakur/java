package Ifelse;

import java.util.Scanner;

public class Increasinngordecreasing {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter  1st no. ");
int a=sc.nextInt();
System.out.println(a);
System.out.println("enter  2nd no. ");
int b=sc.nextInt();
System.out.println(b);
System.out.println("enter  3rd no. ");
int c=sc.nextInt();
System.out.println(c);
if(a<b&&b<c)
{
	System.out.println("increasing order ");

}
else if(b>c&&a>b)
{
	System.out.println("decreasing order ");

}
else
{
	System.out.println("random order ");

}sc.close();
	}

}
