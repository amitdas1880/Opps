

// First Example

/*
class Bank{
    public String name ;                            //Instance variable
    public static int account;                      //Instance variable
    public int amount;                              //Instance variable
    protected String Ifsc ="HDFC0000150";          //Instance variable 
    //Non-parameterized constructor
    public Bank(){
        name="Amit";
        account=1801;
        amount=100000;
        
        System.out.println("Default constructor  -> "+name+" "+account+" "+amount);

    }
    
    //Parameterized constructor
    Bank(String name,int account,int amount){
        System.out.println("Parameterized constructer ->  "+name+" "+account+" "+amount);
    }
    
    //METHOD CALL()
    public void detail(String name, int account, int amount){
        havefun();
        this.name=name;
        this.account=account;
        this.amount=amount;
        System.out.println("Method call -> "+name+" "+account+" "+amount);
        
    }
    public void havefun(){
        System.out.println("Welcome To HDFC Bank");
        moralstory();
        
    }
    protected void moralstory(){
        System.out.println("Honesty is the best policy");
        
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank();
	
	    
	    //Access it inside the same package but out side the class( it means we can use it in another class).
	    bn.moralstory();   // Method call.
	    System.out.println("The IFSC Code of HDFC Bank is "+bn.Ifsc);    // instance variable call
	    
	    // Access inside the class.
	    bn.havefun();          
	}
}
*/

 /*Note - 
 1. Access inside the class.
 2. Access it inside the same package but out side the class( it means we can use it in another class).
 
 */

// Second Example

class Bank{
    public String name ;                            //Instance variable
    public static int account;                      //Instance variable
    public int amount;                              //Instance variable
    protected String Ifsc ="HDFC0000150";          //Instance variable 
    //Non-parameterized constructor
    public Bank(){
        name="Amit";
        account=1801;
        amount=100000;
        
        System.out.println("Default constructor  -> "+name+" "+account+" "+amount);

    }
    
    //Parameterized constructor
    Bank(String name,int account,int amount){
        System.out.println("Parameterized constructer ->  "+name+" "+account+" "+amount);
    }
    
    //METHOD CALL()
    public void detail(String name, int account, int amount){
        havefun();
        this.name=name;
        this.account=account;
        this.amount=amount;
        System.out.println("Method call -> "+name+" "+account+" "+amount);
        
    }
    public void havefun(){
        System.out.println("Welcome To HDFC Bank");
        moralstory();
        
    }
    protected void moralstory(){
        System.out.println("Honesty is the best policy");
        
    }
}

class Atm extends Bank{
    public String branch ;
    protected static int no_of_atm=150;
    Atm(){
      branch = "Jamshedpur";
      no_of_atm = 120;
      
    }
    
    Atm(String branch,int no_of_atm){
        this.branch=branch;
        this.no_of_atm=no_of_atm;
        System.out.println("Branch -> "+branch+" No Of ATM -> "+no_of_atm);
    }
    protected void welcome(String brch){
        System.out.println("Welcome to the ATM of the HDFC Bank in " +brch+ " Branch");
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank();                   // OR  Bank bn = new Atm();  
		Atm at = new Atm ("Kolkata",160);
		//System.out.println("Branch -> "+at.branch+" No Of ATM -> "+at.no_of_atm);
	    at.welcome("Mumbai");
	    at.moralstory();
	    
	            
	}
}

//Note - Access it inside the same package but child class.
