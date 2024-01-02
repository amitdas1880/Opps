


/* OVERRIDING :- When the child class has the same method/function as the parent class.
Then the method of the child class is said to Override the method in the parent class.
method Override is the way to achieve  the runtime polymorphism. 

*/
//Example :- (Without Overriding)

/*
//PARENT CLASS
class Bird{
    String name;
    String color;
    
    
    //Non-parameterized constructor
    Bird(){
      
    }
    //parameterized constructor
    // Function();
    public void fly(){
        System.out.println("Flag your wings");
    }
    
}
// CHILD CLASS
class Eagle extends Bird{
    //Non-parameterized constructor
    
    //parameterized constructor
    
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Eagle eg=new Eagle();
	    eg.fly();
	}
}
*/

//Example :- (With Overiding)

//PARENT CLASS
class Bird{
    String name;
    String color;
    
    
    //Non-parameterized constructor
    Bird(){
      
    }
    //parameterized constructor
    // Function();
    public static void fly(){
        System.out.println("Flag your wings");
    }
    
}
// CHILD CLASS
class Eagle extends Bird{
    //Non-parameterized constructor
    
    //parameterized constructor
    // Function();
    public static void fly(){
        System.out.println("Fly long distance");
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Eagle eg=new Eagle();
	    eg.fly();
	   
	}
}
