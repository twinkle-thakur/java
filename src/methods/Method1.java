package methods;

public class Method1 {
	public int max(int a,int b,int c)
	{
		if(a>b&&a>c)
		return(a);
		else if(b>c)
			return(b);
		else
			return(c);
	}
	public int min(int a,int b,int c)
	{
		if(a<b&&a<c)
		return(a);
		else if(b<c)
			return(b);
		else
			return(c);
	}
	public static void main(String[] args) {
		Method1 l=new Method1();
		System.out.println(l.max(5, 6, 5));
		
		l.min(6, 8, 2);
	}

}
