package practice;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		switch(a) {
		case 1: System.out.println("khushi");
		break;
		case 2: System.out.println("chirag");
		break;
		case 3: System.out.println("twinkle");
		break;
		default:System.out.println("chikhu");
		}
		sc.close();
	}

}
