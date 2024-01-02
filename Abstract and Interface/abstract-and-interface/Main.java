

/*
Abstract :- Abstract function are always empty, we can't write any thing inside the abstract function.
> if our function is abstract type we can't make it private.
> You can't make abstract function in as static.
> Abstract class can contain all abstract and non-abstract method.
> You can make abstract class as static but you can't make abstract function in as static.
*/

//Example of abstract
/*
public class Main{
    //Parent class
    abstract static class pay{
       abstract void dopayment();
    }

//Child class
public static class googlepay extends pay{
        void dopayment(){
        System.out.println("Doing transaction with Googlepay");
        }
}

public static void main (String[] args) {
    pay p1 = new googlepay();
    p1.dopayment();
}
}

*/
//Example of interface

public class Main{
    //Parent class
    interface fly{
      public void flyable();
    }
interface nonfly{
      public void nonflyable();
    }
//Child class
public static class hen implements nonfly{
        public void nonflyable(){
        System.out.println("Hen can not fly");
        }
}
public static class parrot implements fly{
        public void flyable(){
        System.out.println("Parrot can fly");
        }
}

public static void main (String[] args) {
    fly f1 = new parrot();
    f1.flyable();
    
    nonfly f2 = new hen();
    f2.nonflyable();
}
}

//Note:- The work of abstract and interface are same, but they are different type and different method.
// We can use multiple inheritance in interface but not in abstract.