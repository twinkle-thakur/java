package loops;

import java.util.Scanner;

public class Pp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");	
		char c=sc.next().charAt(0);
		System.out.println(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");	
		}
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("vowel");	
		}
		else
		{
			System.out.println("consonent");	
		}
	}

}
