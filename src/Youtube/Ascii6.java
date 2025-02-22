package Youtube;

import java.util.Scanner;

public class Ascii6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr ch ");
		char c=sc.next().charAt(0);
		
		int a=(int)c;
		System.out.println("ASCII value of "+ c +" is "+a);
		sc.close();
	}

}
