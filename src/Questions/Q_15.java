package Questions;

public class Q_15 {

	public static void main(String[] args) {
		int a=11211;
		int ans=0;
		
		for(int i=a;i>0;i=i/10) {
			int rem=i%10;
			ans=(ans*10)+rem;
		}
		if(ans==a) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		
	}

}
