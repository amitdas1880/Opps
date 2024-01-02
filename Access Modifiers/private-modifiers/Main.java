
// First Example
/*
class Bank{
    public String name ;        //Instance variable
    public static int account;  //Instance variable
    public int amount;          //Instance variable
    private int i=1;            //Instance variable
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
    //Parameterized constructor
    Bank(String name,int amount){
        System.out.println("Parameterised constructer -> "+name+" "+amount);
    }
    
    
    //METHOD CALL()
    public void detail(String name, int account, int amount){
        havefun();
        this.name=name;
        this.account=account;
        this.amount=amount;
        System.out.println("Method call -> "+name+" "+account+" "+amount);
        
    }
    public static void havefun(){
        System.out.println("Welcome To HDFC Bank");
        //this.detail();                        //Non static method/function
    }
    
    public void firstmethod(){
        int i=5; int j=10;
        this.i=i+j;
        System.out.println(i);
        secondmethod(20);
    }
    public void secondmethod(int i){
        int j=30;
        this.i=i+j;
     System.out.println(i);
 
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank();
	    
	
		bn.firstmethod();
		

	}
}
*/

// Second Example
/*

class Bank{
    public String name ;        //Instance variable
    public static int account;  //Instance variable
    public int amount;          //Instance variable
    private int i=1;            //Instance variable
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
    public static void havefun(){                               //static function
        System.out.println("Welcome To HDFC Bank");
        moralstory();
        
    }
    private static void moralstory(){                           //static function
        System.out.println("Honesty is the best policy");
        
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank();
	
	    Bank.havefun();

	}
}
*/

/* Note :- As we know the private modifier can not Access inside the same package but out side the class.
it only Access inside the same class.
*/

// Third Example
class Bank{
    public String name ;        //Instance variable
    public static int account;  //Instance variable
    public int amount;          //Instance variable
    private int i=1;            //Instance variable
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
    private void moralstory(){
        System.out.println("Honesty is the best policy");
        
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank();
	
	    bn.havefun();

	}
}

