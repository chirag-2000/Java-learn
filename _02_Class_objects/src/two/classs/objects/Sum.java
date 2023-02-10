package two.classs.objects;

//Method Overrididng
//Overriding means same method name and same parameter, 
//occur in different class that has inheritance relationship. 
//we use method overriding to implement specific functionality to the method.
//Run time polymorphism

//Method overrididng signature :  method , arguments and the return type together is called signature


public class Sum {
	  
    public int sum(int x, int y) {
    	return (x + y); 
    	}
  
    
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    public double sum(double x, double y)
    {
        return (x + y);
    }
  
   
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}



//Method overloading allows more than one method in a class to have the same name with different parameters. 
//Basically, we can create multiple methods with the same name in the same class. 
//However, each method works differently. It makes the program easier to read (readable). 
