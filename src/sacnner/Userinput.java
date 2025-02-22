package sacnner;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println(age);
		String s=age>18?"eligble for vote":"not eligible";
		System.out.println(s);
sc.close();
	}

}
