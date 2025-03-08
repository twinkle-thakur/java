package wrapperClasses;

public class Classes {
public static void main(String[] args) {
	int b=1;//primitive data type
	Integer b1=1; //internally b is wraped to integer and converted to an Object
	
	//AutoBoxing:boxing and unboxing automatically jvm kr deta hai
	
	//Boxing
	//backend pr b1 is converted as b2 but jvm done it therefore no need to write this
	Integer b2=Integer.valueOf(1);//this is called autoboxing which jvm does by itself
	
	//UnBoxing
	//data to unwrap krna 
	Integer b3=1;
	int b4=b3.intValue(); //now b3 is unwraped and it is now primitive data type 
	//but no need to convert b3 like that becoz jvm converts it automatically 
	int b5=b3;//we can simply writw like this
	
	
	//Other Wrapper classes
	Float f=2.12f;
	Long l=234235l;
	Double d=123.34432;
	Boolean t=true;
	Character c='s';
	Byte bb=12;
	Short s=1232;
}
}
