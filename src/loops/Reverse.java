package loops;

public class Reverse {
//this is wrong
	public static void main(String[] args) {
		int num=54321;
		
		for(int i=1;i<=5;i++)
		{
			 int data=num%10;
			 num/=10;
 
			 System.out.print(data);
		}
		
			}

}
