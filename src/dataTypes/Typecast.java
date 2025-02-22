package dataTypes;

public class Typecast {
//implictly (automatically done by compiler) (Widening conversion)
	
	byte a=10;
	
	short b=a;
	int c=a;
	long d=a;
	float f=a;
	double e=a;
	char g=10;
//explictly	(we type cast explictly) (Narrowing conversion)
	float f1=3.5f;
	
	int c1=(int)f1;
}
