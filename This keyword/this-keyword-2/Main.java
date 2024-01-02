

/*class Persone{
    String name;
    String city;
    int age;
    double hight;
    //Non-parameterized constructor
    Persone(){
       
    }
    //parameterized constructor
    Persone(String name,String city,int age, double hight){
        this.name = name;
        this.city=city;
        this.age=age;
        this.hight=hight;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone("Virat","Delhi",30, 5.7);
	    Persone p2=p1;
	    


		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight + " Address "+p1);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight +" Address "+p2);
		

	}
}
Note:- the address of p1 and p2 are same.if we any thing change in p1 it atomaticly change in p2.
in heap memory there is only one memory location is created i.e p1. We can not use (new) keyword for p2.
*/

class Persone{
    String name;
    String city;
    int age;
    double hight;
    //Non-parameterized constructor
    Persone(){
       
    }
    //parameterized constructor
    Persone(String name,String city,int age, double hight){
        this.name = name;
        this.city=city;
        this.age=age;
        this.hight=hight;
        
    }
    // we can put any name eg:- class_name(class_name  parameter_name) 
    Persone(Persone p){  
        this.name = p.name;
        this.city=p.city;
        this.age=p.age;
        this.hight=p.hight;
        
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone("Virat","Delhi",30, 5.7);
	    Persone p2=new Persone(p1);
	    p2.name = "Amit";
	    p2.age=27;


		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight + " Address "+p1);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight +" Address "+p2);
		

	}
}
//Note:- 
