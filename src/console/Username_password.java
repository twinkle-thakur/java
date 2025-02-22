package console;

import java.io.*;

public class Username_password {

	public static void main(String[] args) {
		String s;char c[];
		Console obj=System.console();
		System.out.println("enter user name :");
		 s=obj.readLine();
		System.out.println("enter pasword :");
		c=obj.readPassword();
		String a=String.valueOf(c);
		System.out.println(s);
		System.out.println(a);
	}

}
