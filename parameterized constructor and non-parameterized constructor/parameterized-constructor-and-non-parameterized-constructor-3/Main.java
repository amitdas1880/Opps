


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
       
    }
    //parameterized constructor
    Persone(String n,String c,int a, double h){
        name = n;
        age=a;
        city=c;
        hight=h;
        
    }
    
    Persone(String n,String c,int a){
        name = n;
        age=a;
        city=c;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone p2=new Persone("Virat","Delhi",30, 5.7);
	    Persone p3=new Persone("Sky","Kolkata",30);


		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight);
		
		System.out.println("Name "+p3.name+" city "+p3.city+" age "+p3.age+" hight "+p3.hight);


	}
}
/* Note : We can define more then one parameterized constructor.
    No two constructor argument can not have same parameter list.
    e.g -> (First parameterized constructor) Persone(String n,String c,int a, double h)    
           (Second parameterized constructor) Persone(String n,String c,int a)
           
    e.g -> (First parameterized constructor) Persone(String n,String c,int a, double h)
           (Second parameterized constructor) Persone(String n,String c,int a, String p)
*/

