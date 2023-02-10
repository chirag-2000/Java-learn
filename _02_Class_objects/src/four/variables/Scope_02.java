package four.variables;

public class Scope_02 {
	
	final int instance_var = 10;//value is neccsary in Final When you declare a variable as final, it means you are telling the compiler that this variable is constant
	public static void main(String[] args) {
		
		Scope_02 obj = new Scope_02();
		System.out.println(obj.instance_var);//value will be zero because by default instance variable is default

	}

}
