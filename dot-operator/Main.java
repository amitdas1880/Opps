



class Animal{
    //Instance Variable  OR Globle variable
    String name;
    String color;
    int age;
    String breed;
   
   //Instance Method
   public void eat(){
       System.out.println(name+" is eating");
   }
   public void sleep(){
       System.out.println(name+" is sleeping");
   }
   public void Detail(){
       System.out.println(name+" is an animal "+color+"color "+age+" years age "+breed+" breed");
   }
    
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name    =      new         class_name();
	    //                [    Declaration      ]   = [Instantiation] [Instantiation]
	    Animal dog1=new Animal();
	    dog1.name="Tommy";
	    dog1.color="brown";
	    dog1.age=4;
	    dog1.breed="German Shepherd";
	   
	    dog1.Detail();      // call the method
	    dog1.eat();         // call the method
	    dog1.sleep();       // call the method
	   
	   Animal dog2=new Animal();
	    dog2.name="Puppy";
	    dog2.color="Black";
	    dog2.age=3;
	    dog2.breed="Bulldog";
	    
	    dog2.eat();         // call the method
	    dog2.Detail();      // call the method
	    dog2.sleep();       // call the method
	    
	    
	}
}
/*
Dot operator  is used to separate a variable and method from a reference variable.
It is also used to access classes and sub-packages from a package.
It is also used to access the member of a package or a class.

Referance variable is nothing but the name of the object.
*/