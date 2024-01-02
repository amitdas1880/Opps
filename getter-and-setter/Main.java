

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
    // Use of setter
    public void setname(String name){
        this.name=name ;
    }
    // Use of getter
    public String getname(){
        return this.name;  // OR return name;
    }
    // Use of setter
    public void setage(int age){
        this.age=age;
    }
    // Use of getter
    public int getage(){
        return this.age;  // OR return age;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone("Virat","Delhi",30, 5.7);
	    System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight + " Address "+p1);
	    
	    p1.setage(35);
	    p1.setname("Rohit sharma");

		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight + " Address "+p1);

	}
}

/*
Note :- A setter method is used to sets or updates its value while a getter method used to returns its value.
*/