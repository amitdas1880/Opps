

//PARENT CLASS
class Rbi{
    String bank;
    String city;
    int no_of_branch;
    
    //Non-parameterized constructor
    Rbi(){
       this.bank="HDFC BANK";
       this.city="MUMBAI";
       this.no_of_branch=55;
      // System.out.println("Bank "+bank+ " City "+city+" Number of Branch "+no_of_branch);

    }
    //parameterized constructor
    
    Rbi(String bank, String city, int no_of_branch){
        this.bank=bank;
        this.city=city;
        this.no_of_branch=no_of_branch;
    }
}
// CHILD CLASS
class Bank extends Rbi{
    int no_of_atm=552;
    final String Ifsc="HDFC000015";
    //Non-parameterized constructor
    Bank(){
       System.out.println(bank +" "+city+" "+no_of_atm+" "+no_of_branch+" "+Ifsc);
    }
    //parameterized constructor
    
    Bank(int no_of_atm){
        this.no_of_atm=no_of_atm;
        System.out.println("Bank "+bank+ " City "+city+" Number of Branch "+no_of_branch+" Number of ATM "+no_of_atm+" IFSC CODE "+Ifsc);

        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name();
	   Rbi bn=new Bank();
	    
	   Bank bk =new Bank(50);
	   // Use the properties of RBI and put the value in BANK.
	    bk.bank="ICICI BANK";
	    bk.city="DELHI";
	    bk.no_of_branch=45;
	    System.out.println("Bank "+bk.bank+ " City "+bk.city+" Number of Branch "+bk.no_of_branch+" Number of ATM "+bk.no_of_atm+" IFSC CODE "+bk.Ifsc);
	}
}
/* Note :- 
Inheritance :- Inheritance in Java is a Process under which  child class (sub class) can  
               access all the properties and behaviors of a parent class (super class).
               
Types of Inheritance 
 1. Single Inheritance - Yes (1 Parent 1 child)
 2. Mutilevel Inheritance - Yes (1 parent 1 child and 1 parent's parent)
 3. Multiple Inheritance - No - Avoid Ambiguity/Uncertainity and reduce code complexity  
 4. Hierarchical/Tree Inheritance - Yes (2 child 1 parent)
 5. Hybrid Inheritance - No 

*/