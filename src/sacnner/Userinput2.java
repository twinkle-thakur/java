package sacnner;
import java.util.Scanner;
public class Userinput2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age");
	int age =sc.nextInt();
	System.out.println(age);
	System.out.println("enter your name :");
	String name=sc.next();
	System.out.println(name);
	System.out.println("enter your address");
	sc.nextLine();//if we wont write this compiler will directly jump to next line
	String add=sc.nextLine();// nextLine()it is a method which takes space also 
	
	System.out.println(add);
	System.out.println("enter your no.");
	long no=sc.nextLong();
	System.out.println(no);
	sc.close();
		}

}
