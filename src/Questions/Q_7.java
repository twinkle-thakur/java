package Questions;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ch :");
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z') {
        	System.out.println("lower case");
        }
        else if(ch>='A'&&ch<='Z') {
        	System.out.println("uper case");
        }
        else if(ch>='1'&&ch<='9') {
        	System.out.println("digit");
        }
        else
        	System.out.println("special ch");
        sc.close();
	}

}
