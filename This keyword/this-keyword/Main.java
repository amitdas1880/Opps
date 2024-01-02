
// First Case : (With out using this keyword)

/*
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
    Persone(String name,String city,int age, double hight){
        name = name;
        city=city;
        age=age;
        hight=hight;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone p2=new Persone("Virat","Delhi",30, 5.7);
	    


		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight);
		

	}
}
*/
// Second Case : (Using this keyword)

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
	    Persone p1=new Persone();
	    Persone p2=new Persone("Virat","Delhi",30, 5.7);
	    


		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
		
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight);
		

	}
}
 /* Note : this keyword associated with current object . when we used the this keyword it call current object.
 when the name of local variable and instance variable are same.java Compiler not able to differencate .
 In order to differencate both we Use (this) keyword.
 Eg: 
        Persone(String name,String city,int age)
        {
        (instance variable)name = name(local variable);
        (instance variable)city = city(local variable);        
        (instance variable)age= age(local variable);
     
 }
*/
 