class Bank{
    public String name ;
    public static int account;
    public int amount;
    private int i=1;
    //DEFAULT CONSTRUCTER
    public Bank(){
        name="Amit";
        account=1801;
        amount=100000;
    }
    
    // PARAMETERISED CONSTRUCTER
  Bank(String name,int account,int amount){
        System.out.println("Parameterised constructer ->" +name+" "+account+" "+amount+" ");
    }
    Bank(String name,int amount){
        System.out.println("Parameterised constructer -> "+name+" "+amount);
    }
    
    
    //METHOD CALL()
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
		Bank bn = new Bank("pradeep",1806,12539);
		System.out.println("Defalt constructer"+" -> "+bn.name+" "+bn.account+" "+bn.amount);
	    
		bn.firstmethod();
	}
}
