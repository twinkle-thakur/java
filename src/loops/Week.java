package loops;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week");
		int week=sc.nextInt();
		switch(week)
		{
		case 1: 
			System.out.println("monday");
			break;
		case 2: 
			System.out.println("tuesday");
			break;
		case 3: 
			System.out.println("wed");
			break;
		case 4: 
			System.out.println("thur");
			break;
		case 5: 
			System.out.println("fri");
			break;
		case 6: 
			System.out.println("sat");
			break;
		case 7: 
			System.out.println("sun");
			break;
		default:
			System.out.println("wrong");
		}
		sc.close();
		
	}

}
