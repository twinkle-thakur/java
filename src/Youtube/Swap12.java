package Youtube;

import java.util.Scanner;

public class Swap12 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("enter 1st no. ");
int a=sc.nextInt();
System.out.println("enter 2nd no. ");
int b=sc.nextInt();
//wihtout 3rd variable
/*a=a+b;
b=a-b;
a=a-b;*/
//with 3rd variable
int temp=a;
a=b;
b=temp;
System.out.println("after swap "+ a+"\n"+b);
sc.close();
	}

}
