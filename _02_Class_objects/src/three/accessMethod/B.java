package three.accessMethod;

import three.accessMethods.C;

 class A{
	public void sayHello() { //example of public: //remove public to make it default //add private to make it private
		System.out.println("hello from A");
	}
}
public class B {

	public static void main(String[] args) {
	A a = new A();//example of public:
	a.sayHello();

	 
	C c = new C();
	c.sayHello();
	 
	//child class using extend  //also change class C to protected
//	B c = new B();
//	c.sayHello();
	
	D d = new D();
	d.sayHi();
	
	}

}

class D {
	 void sayHi() {  //default 	
		System.out.println("Hi from D");
	}
}
