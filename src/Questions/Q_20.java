package Questions;

public class Q_20 {

	public static void main(String[] args) {
		int a=23481;
		int check=0;
		for(int i=a;i>0;i=i/10) {
			int r=i%10;
			if(r>check) {
				check=r;
			}
		}
		System.out.println("greatest no.in "+a+" is "+check);
	}

}
