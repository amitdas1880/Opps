
/*
// With out using Encapsulation
class AccountHolder{
    int accountbalance;
    AccountHolder(int balance){
        this.accountbalance=balance;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    AccountHolder ah =new AccountHolder (500);
	    System.out.println(ah.accountbalance);
	}
}
*/
// With using Encapsulation
/*
class AccountHolder{
    private int accountbalance;
    AccountHolder(int balance){
        this.accountbalance=balance;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    AccountHolder ah =new AccountHolder (500);
	    System.out.println(ah.accountbalance);
	}
}
*/

// Getter and Setter Function


class AccountHolder{
    private int accountbalance;     //instance variable
    AccountHolder(int balance){
        this.accountbalance=balance;
    }
    
    public int getaccountbalance(){  // Getter function
        return accountbalance ;
    }
    
    public void updatebalance(int balance){  // Setter function (Update bank balance)
        this.accountbalance=balance ;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    AccountHolder anup =new AccountHolder (500);
	    System.out.println(anup.getaccountbalance());
	    
	    anup.updatebalance(10000);                  // Update bank balance
	    System.out.println(anup.getaccountbalance());


	}
}


/*
Note -
Encapsulation - The variables and code of a class is hidden from other class , and can be accessed
                only through the methods(function) of the current class.

Steps to achive Encapsulation -
1.Declare the variable of a class as private.
2.Provide public getter and setter methods to modify and view the variables value.

*/