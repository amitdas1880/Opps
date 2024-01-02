


class Bank{
    public String name ;        //Instance variable
    public static int account;  //static variable
    public int amount;          //Instance variable
    public final String Ifsc = "HDFC0000150";        //Instance variable
    //Non-parameterized constructor
    public Bank(){
        name="Amit";
        account=1801;
        amount=100000;
        System.out.println("Default constructor  -> "+name+" "+account+" "+amount+" "+Ifsc);

    }
    
    //Parameterized constructor
    Bank(String name,int account,int amount){
        System.out.println("Parameterized constructer ->  "+name+" "+account+" "+amount+" "+Ifsc);
    }
    
    //METHOD CALL()
    public void detail(String name, int account, int amount){
        havefun();
        this.name=name;
        this.account=account;
        account++;
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
    public static void increase(int account){
        account++;
        System.out.println(account);
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank bn = new Bank("Sumit",18005,15236);
	   Bank.increase(18002);
	   System.out.println(bn.Ifsc);

	}
}
/*
Note :- The final keyword in java is used to restrict the user.
the final keyword is used to indicate that a variable, method, or class cannot be modified or extended.
the final variable cannot be reinitialized/modified with another value.
the final method cannot be overridden.
the final class cannot be extended.
*/