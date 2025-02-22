package practice;

public class Diamond {

	public static void main(String[] args) {
		int a=3;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=a-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=a;i++) {
		for(int j=i;j>0;j--)
		for(int j=a;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
