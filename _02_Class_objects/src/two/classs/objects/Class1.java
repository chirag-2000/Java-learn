package two.classs.objects;

public class Class1 {

	public static void main(String[] args) {
		 Person  alex = new Person(); //reference variable will be created in the name of alex and person obj will be created in the heap memeory 
		 alex.name = "Alex"; //once complier executes this line name will be assigned to person obj and alex ref will be pointing to it
		 alex.age =55;
		 alex.gender ="Male";
		 alex.sleep();//control jumps to sleep method
		 
		 Person mia = new Person();
		 mia.name="Mia";
		 mia.age=8;
		 mia.gender="Female";
		 mia.sleep();
	}
}

class Person {
	
	String name;
	int age;
	String gender;
	
	
	void sleep() {
		if (age<10) {
			System.out.println(name + " will sleep more than 12 hours a day");
		}
		else if (age>=10 && age<=50) {
			System.out.println( name + " will sleep less than 12 hours a day" );
		}
		else {
			System.out.println(name + " will sleep average 10 hours a day");
		}
	}
	
}




