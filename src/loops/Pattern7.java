package loops;

public class Pattern7 {

	public static void main(String[] args) {
		int data=65;
		for(int i=1 ;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char)data);
				data++;
			}
			System.out.println();
		}
	}

}
