


class Persone{
    String name;
    String city;
    int age;
    double hight;
    // defult constracter 
    Persone(){
        name="Virat";
        city="Delhi";
        age=30;
        hight=5.7;
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
	    Persone p2=new Persone();
	    //put the value
	    p2.name="Rohit";
	    p2.city="Mumbai";
	    p2.age=29;
	    p2.hight=5.9;

		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
		System.out.println("Name "+p2.name+" city "+p2.city+" age "+p2.age+" hight "+p2.hight);

	}
}
