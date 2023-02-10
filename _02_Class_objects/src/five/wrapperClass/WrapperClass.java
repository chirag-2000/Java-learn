package five.wrapperClass;

//In wrapper class As the wrapper classes have objects we can store null as a value. We could not store null in variables of primitive datatype.
//Everything has to be object to be an oops but primitive datattypes are not object like int float char 
//Classes for these data type are called  wrapper class
//Converting primitive to object is called autoboxing.
//So Getting the primitve
//getting the primitive value from object is called as Unboxing

	
public class WrapperClass {

	public static void main(String[] args) {
		Integer  a = Integer.valueOf(10); //ref var pointing to integer object //autoboxing :  is the automatic conversion of conversion  of Premitive datatype  into its corresponding wrapper classes. 
//		Integer a = 10;
		int b=20;
		int c= a;
		System.out.println("c: " +  c);
		
		if(a==10) {
			c= a+b;
		}
		
		System.out.println("c:"  +  c);
		
		int temp= a.intValue();
//		System.out.println(temp);
	}
	

}
