package loops;

public class Sumofalldigit {

	public static void main(String[] args) {
		int a=678;
		int sum=0;
		System.out.println(a);
		for(int i=a;i>0;i=i/10)
		{
		int data=i%10;
		sum=sum+data;
		}
		System.out.println(sum);
	}

}
