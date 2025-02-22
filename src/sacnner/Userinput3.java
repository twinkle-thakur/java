package sacnner;
import java.util.Scanner;
public class Userinput3 {

	public static void main(String[] args) {
		float a,b,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a & b : ");
     a=sc.nextFloat();
     b=sc.nextFloat();
     System.out.println("a ="+ a +"b= " + b);
     System.out.println("the sum is a + b : ");
     sum=a+b;
     System.out.println(sum);
     sc.close();
	}

}
