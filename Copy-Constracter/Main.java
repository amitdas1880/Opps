

class Persone{
    String name;
    String city;
    int age;
    double hight;
    //Non-parameterized constructor
    Persone(){
       name ="Rohit";
       city = "Mumbai";
       age=25;
       hight=5.3;
       System.out.println("Defult");
       System.out.println("Name "+name+" city "+city+" age "+age+" hight "+hight);

    }
    //parameterized constructor
    
    Persone(Persone copy){
        name = copy.name;
        age=copy.age;
        city=copy.city;
        hight=copy.hight;
        
       System.out.println("Memory Address "+ copy);
       System.out.println("Copy constructor");
       System.out.println("Name "+name+" city "+city+" age "+age+" hight "+hight);

        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone p2=new Persone(p1);
	    
	    System.out.println("Memory Address of p1 "+p1);
	    System.out.println("Memory Address of p2 "+p2);
	}
}
/* Note :- the memory address of p1 and p2 are different.
*/