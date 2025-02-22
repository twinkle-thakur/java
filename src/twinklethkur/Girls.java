package twinklethkur;

public class Girls {

	public static void main(String[] args) {
		float students=90;
		float boys=45;
		float girls=students-boys;
		System.out.println("total studentds : "+students);
		System.out.println("no. of boys "+boys);
		System.out.println("no. of girls "+girls);

		float per=(students/100)*50;
		System.out.println("50% of to. students secured grade A :"+per);

		System.out.println("out of which 20 are boys ");
		float result=per-20;
		System.out.println("therefore total no. of girls secured grade A are :  "+result);
}

}
