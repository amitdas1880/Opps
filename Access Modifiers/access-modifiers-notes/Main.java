

1.public :

We can access public modifier everywhere like before the package, before the class, before the variable,
before the function, before constant variable.

We can use public property 
1.inside the class.
2.inside the same package but out side the class( it means we can use it in another class).
3.Access it other package but out side the class( it means we can use it in another class) (import.package_name.class_name)..
4.inside the same package but child class.(Inheritance)(using extends keyword).
5.Access it other package but child class.(Inheritance)(using extends keyword) (import.package_name.class_name).

https://www.geeksforgeeks.org/access-modifiers-java/

public package1;

public class abc{
    public int a=5;
    public String str="hello";
    public int final b=10;
    
    public void function(){
        System.out.println("This is public function");
    }
    
}
public class xyz{
    public void pqr(){
        
    abc obj=new abc();
    System.out.println(obj.a);
    }
    }
    
}

public package2;
import.package1.abc;

public class ijk{
    public void uvw(){
        
    abc obj1=new abc();
    System.out.println(obj1.a);
    }
    }
    
}



2.private :

We can access private modifier before the variable,before the function, before constant variable.

We can use private property 
1.inside the class only.
2.We can not Access it inside the same package but out side the class( it means we can use it in another class).
3.We can not Access it use it other package but out side the class( it means we can use it in another class) (import.package_name.class_name)..
4.We can not Access it inside the same package but child class.(Inheritance)(using extends keyword).
5.We can not Access it use it other package but child class.(Inheritance)(using extends keyword).

public package

public class abc{
    private int a=5;
    private String str="hello";
    private int final b=10;

    
    private void function(){
        System.out.println("This is public function");
    }
    
}


3.protected :

We can access protected modifier before the variable,before the function ,before constant variable.

We can use protected property 
1.inside the class .
2.Access it inside the same package but out side the class( it means we can use it in another class).
3.We can not access it other package but out side the class( it means we can use it in another class) (import.package_name.class_name)..
4.Access it inside the same package but child class.(Inheritance)(using extends keyword).
5.Access it other package but child class.(Inheritance)(using extends keyword).(import.package_name.class_name).

public package

public class abc{
    protected int a=5;
    protected String str="hello";    
    protected int final b=10;

    
    protected void function(){
        System.out.println("This is public function");
    }
    
}


4.Default :

We can access default modifier before the class, before the variable, before the function, before constant variable.

We can use default property 
1.inside the class only.
2.We can Access it inside the same package but out side the class( it means we can use it in another class).
3.We can not Access it use it other package but out side the class( it means we can use it in another class) (import.package_name.class_name)..
4.We can Access it inside the same package but child class.(Inheritance)(using extends keyword).
5.We can not Access it other package but child class.(Inheritance)(using extends keyword).


public package

    class abc{
     int a=5;
     String str="hello";
     int final b=10;

    
     void function(){
        System.out.println("This is public function");
    }
    
}



