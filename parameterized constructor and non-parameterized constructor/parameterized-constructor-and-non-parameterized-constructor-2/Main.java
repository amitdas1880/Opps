

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
    Persone(String n,int a,String c, double h){
        name = n;
        age=a;
        city=c;
        hight=h;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone p2=new Persone("Virat", 30, "Delhi", 5.7);

		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight);

	}
}
