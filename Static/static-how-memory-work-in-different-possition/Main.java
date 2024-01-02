

//  PROBLEM
/*
class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    
    //Non-parameterized constructor
    Persone(){
      
          }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city);
    }    
    public static void swap(Persone per1, Persone per2){
        Persone temp = per1;
        per1=per2;
        per2=temp;
            }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	   
	    Persone p1=new Persone("Virat","Delhi",30);
	    Persone p2=new Persone("Rahul","Mumbai",29);
	    
	    System.out.println("Before Swaping");
	    p1.detail();
	    p2.detail();
	    
	    Persone.swap(p1, p2);
	    System.out.println("After Swaping");
	    p1.detail();
	    p2.detail();
	    
	}
}
*/

/* Note:- per1, per2 and temp are the local variable to the function swap. 
per1 and per2 got swap but p1 and p2 are remaining same .
if you make it globle the it swap in globle level.
*/

//First Solution
/*
class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    
    //Non-parameterized constructor
    Persone(){
      
          }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city);
    }    
    public static void swap(Persone per1, Persone per2){
        Persone temp = per1;
        per1=per2;
        per2=temp;
        
        System.out.println("After Swaping");
        per1.detail();
        per2.detail();
            }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	   
	    Persone p1=new Persone("Virat","Delhi",30);
	    Persone p2=new Persone("Rohit","Mumbai",29);
	    
	    System.out.println("Before Swaping");
	    p1.detail();
	    p2.detail();
	    
	    Persone.swap(p1, p2);
	   // System.out.println("After Swaping");
	   // p1.detail();
	    //p2.detail();
	    
	}
}
*/

//Second Solution

/*
class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    
    //Non-parameterized constructor
    Persone(){
      
          }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city);
    }    
    public static void swap(Persone per1, Persone per2){
     
    
       String name = per1.name;
       per1.name=per2.name;
       per2.name=name;
       
       
       int age = per1.age;
       per1.age=per2.age;
       per2.age=age;
        // System.out.println("After Swaping");
        // per1.detail();
        // per2.detail();
            }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	   
	    Persone p1=new Persone("Virat","Delhi",30);
	    Persone p2=new Persone("Rohit","Mumbai",29);
	    
	    System.out.println("Before Swaping");
	    p1.detail();
	    p2.detail();
	    
	    Persone.swap(p1, p2);
	    System.out.println("After Swaping");
	    p1.detail();
	    p2.detail();
	    
	}
}
*/

/* Note:- through this method we can swap single variable.
*/

// Third Example

class Persone{
    String name;                //instance variable
    String city;                //instance variable
    int age;                    //instance variable
    
    //Non-parameterized constructor
    Persone(){
      
          }
    //parameterized constructor
    Persone(String name,String city,int age){
        this.name = name;
        this.city=city;
        this.age=age;
        
        
    }
    public void detail(){
        System.out.println(name+" is "+age+" years old and live in "+city);
    }    
    public static void swap(Persone per1, Persone per2){
     
     per1=new Persone();           
       String name = per1.name;
       per1.name=per2.name;
       per2.name=name;
       
     per2=new Persone(); 
       int age = per1.age;
       per1.age=per2.age;
       per2.age=age;
        // System.out.println("After Swaping");
        // per1.detail();
        // per2.detail();
            }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	   
	    Persone p1=new Persone("Virat","Delhi",30);
	    Persone p2=new Persone("Rohit","Mumbai",29);
	    
	    System.out.println("Before Swaping");
	    p1.detail();
	    p2.detail();
	    
	    Persone.swap(p1, p2);
	    System.out.println("After Swaping");
	    p1.detail();
	    p2.detail();
	    
	}
}
