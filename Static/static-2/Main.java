

 // We can't call non-static member from static
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
    public static void fun(){
        System.out.println("We like having fun");
        this.detail();                  //non-static member
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
	    Persone.fun();

	}
}

*/

/* Note :- if we remove (this.detail()) from static function then it is possible to call. 
Because it try to call  non-static member from static.
*/

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
    
    public static void lifestory(){
        System.out.println("Honesty Is The Best Policy");
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
	    
	    
	    Persone.lifestory();

	}
}

/*
In static method, it can be called without creating any instance of the class.
Note - INSTANCE :- When we create an object of the class we can create the instance of the class.

*/
