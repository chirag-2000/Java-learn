package four.variables;

public class Operators_03 {

	public void operatorTest() {
		//arithmetic
		int count = 10;
		System.out.println(count);
		int extraCount = 2;
		System.out.println(count-extraCount);
		int a =40;
		int b=20;
		System.out.println(a+b);
		System.out.println("total count ::"+ count + extraCount); //concatination will takeplace
		System.out.println("total count ::"+ (count + extraCount)); 
	
	//relational
		int totalCount = count;
		if(extraCount > 2) {
			totalCount = count+ extraCount;
		}
		System.out.println(totalCount);
		
		System.out.println(totalCount==count);
		System.out.println(totalCount>=count);
		System.out.println(totalCount<count);
		
		//string objects
		String str = new String("Java");//String variable will be created in heap and str refrence variable will be pointing to the obj
		String str2 = new String("Java");
		
		if(str==str2) {//here == operator checks if they are pointing to same operator or not
			System.out.println("Print they are same");
		}else {
			System.out.println("Not Same!!");
		}
		
		if(str.equals(str2)) {//equal method from string class
			System.out.println("Print they are same");
		}else {
			System.out.println("Not Same!!");
		}
		
		//increment operators
		int a1=10;
		int b1=2;
		
		System.out.println(a1++);//value will be incremented only after the satetement is executed
		System.out.println(a1);
		System.out.println(++b1);
		
//		conditional operator
		int x=10;
		int y= 5;
		String z = (x>y) ? "TRUEE" : "FALSEE" ;
		System.out.println(z);
		
		//Logical operator
		int i1=10;
		int o1=12;
		System.out.println((i1==o1 && i1>o1));//true only if both are true
		System.out.println((i1==o1 || i1<o1));//True if any one is true
		System.out.println(!(i1==o1));//INVERSE  FALESE INVERSE IS TRUE  
		//SINGLE $ OR | evaluates both side
	}
	public static void main(String[] args) {
	Operators_03 obj = new 	Operators_03();
	obj.operatorTest();
	}

}
