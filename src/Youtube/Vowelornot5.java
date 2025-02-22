package Youtube;

import java.util.Scanner;

public class Vowelornot5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ch ");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			System.out.println("vowel");
		}
		else {
			System.out.println("consonent");
		}sc.close();
	}

}
