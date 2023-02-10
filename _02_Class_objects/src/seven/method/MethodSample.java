package seven.method;

public class MethodSample {

	public static void main(String[] args) {
		MethodSample obj = new MethodSample();	
		obj.sayHello("female"); //passing Parameter
	}
	
	public void  sayHello(String gender) { //local variable  , passing parameter ;
		String newTextString = gender.equalsIgnoreCase("Male") ? "Hello sir" : "Hello Madam" ;
		System.out.println(newTextString);
	}

}
