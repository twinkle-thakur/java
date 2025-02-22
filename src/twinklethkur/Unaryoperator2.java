package twinklethkur;

public class Unaryoperator2 {

	public static void main(String[] args) {
		int num=10;
		int num2=2;
		num++;//11
		--num2;//1
		num2=num++;//num2=11&num=12
		num=++num2;//num=12&num2=12
		System.out.println(num2);
		System.out.println(num);
	}

}
