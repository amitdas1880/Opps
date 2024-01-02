


class Persone{
    String name;
    String city;
    int age;
    String lastname;
    //Non-parameterized constructor
    Persone(){
       
    }
    //parameterized constructor
    Persone(String name,String city,int age){
        this();      // call another constructor.
        this.name = name;
        this.city=city;
        this.age=age;
        
    }
    // we can put any name eg:- class_name(class_name  parameter_name) 
    Persone(String name,String city,int age,String lastname){  
        this(name,city,age);
        this.lastname=lastname;
        
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone("Virat","Delhi",30);
	    Persone p2=new Persone("Rohit" ,"Mumbai",30,"Sharma");
	    

		System.out.println("Name "+p1.name+" lastname "+p1.lastname +" city "+p1.city+" age "+p1.age+ " Address "+p1);
		
		System.out.println("Name "+p2.name+" lastname "+p2.lastname+" city "+p2.city+" age "+p2.age +" Address "+p2);
		

	}
}
/* Note: In constructor chaining one constructor can call another constructor 
or we can say it is the process of calling sequence of constructors.
We can do it in two ways: by using "this()" keyword and by using "super()" keyword. 
*/