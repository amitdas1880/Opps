

// First Example (Without Using Static)
/*
class Persone{
    String name;
    String city;
    int age;
    int count;
    //Non-parameterized constructor
    Persone(){
       this.name=null;
       this.age=0;
       this.city=null;
       this.count++;
    }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        this.count++;
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city+"and is the "+count+"th persone");
    }    
    
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    p1.detail();
	    Persone p2=new Persone("Virat","Delhi",30);
	    p2.detail();
	    Persone p3=new Persone("Rahul","Delhi",29);
	    p3.detail();

	}
}
*/


// Second Example (With Using Static)

/*
class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    static int count=0;         // Static variable OR class variable
    //Non-parameterized constructor
    Persone(){
       this.name=null;
       this.age=0;
       this.city=null;
       count++;
    }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        count++;
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city+"and is the "+count+"th persone");
    }    
    
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    p1.detail();
	    Persone p2=new Persone("Virat","Delhi",30);
	    p2.detail();
	    Persone p3=new Persone("Rahul","Mumbai",29);
	    p3.detail();

	}
}
*/

/* Note :- if we write (static) then we can't write (this) keyword. 
           > static is not associated with object means the object is not able to change it.
           > static is associated with class variable.
           > we can't call non-static member fron static.
*/

// Third Example (With Using Static)

class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    static int count=0;         // Static variable OR class variable
    //Non-parameterized constructor
    Persone(){
       this.name=null;
       this.age=0;
       this.city=null;
       
    }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city+" and is the "+count+"th persone");
    }    
    
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone.count++;                // first incremented the count.
	    p1.detail();                    // then detail funciton is call.
	    Persone p2=new Persone("Virat","Delhi",30);
	    Persone.count++;
	    p2.detail();
	    Persone p3=new Persone("Rahul","Mumbai",29);
	    Persone.count++;
	    p3.detail();
	    

	}
}
