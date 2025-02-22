package Youtube;

import java.util.Scanner;

public class AtoZ7 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter ch");
char c=sc.next().charAt(0);
for(char i='A';i<=c;i++) {
	System.out.print(i+" ");
}sc.close();
	}

}
