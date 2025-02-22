/*convert ch lower to upper and vise versa*/
//i/n a-z--->uppercase
//i/n A-Z--->lowercase
package Youtube;

import java.util.Scanner;

public class Uppercaselowercase13 {
 static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ch ");
	char c=sc.next().charAt(0);
	if(c>='A'&&c<='Z') {
		System.out.println(Character.toLowerCase(c));
	}
	else {
		System.out.println(Character.toLowerCase(c));
	}sc.close();
	}

}
