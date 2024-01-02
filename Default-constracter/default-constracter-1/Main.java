
import java.util.*;
import java.lang.*;
import java.io.*;

class Persone{
    String name;
    String city;
    int age;
    int hight;
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	    Persone p1=new Persone();
		System.out.println("Name "+p1.name+" city "+p1.city+" age "+p1.age+" hight "+p1.hight);
	}
}
// Note: when we not create any constracter in class, java atomaticly take default constracter. 
// Note : constracter are use to initializer the properties/attributes of a class.