package Questions;

public class Q_21 {

	public static void main(String[] args) {
	String s="naman";
	Boolean b=true;
		
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
			b= false;
		}
	}
	if(b) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
	}

}
