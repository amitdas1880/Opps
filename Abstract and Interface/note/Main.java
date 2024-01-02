

Difference between abstract and interface

                    abstract                                                interface
1.  To declare  abstract class  abstract keywords               1. To declare  interface class  interface keywords
    are used.                                                       are used.
Syntax :                                                       Syntax :                                                       
abstract class Bank{                                            interface class Bank {
                                                                        
}                                                               }

2.abstract class can have abstract and non abstract             2.interface class can have only abstract method.
    method.
Syntax :                                                        Syntax :
abstract class Bank{                                            interface class Bank{
    public void deposit(){ /*non abstract method*/               public void deposit(){ /* abstract method */ 
        System.out.println("Deposit Money");                     
    }                                                               }
    public void withdraw(){ /* non abstract method */              public void interest(){ /* abstract method*/ 
        System.out.println("Withdraw Money");                       
    }                                                               }
    public void interest(){ /* abstract method*/               }
    }
}

3. abstract class does not support multiple inheritance.    3.interface class support multiple inheritance .
    Syntax :                                                    Syntax :
  abstract class Hdfc{                                            interface class Hdfc{
    public void deposit(){ /*non abstract method*/               public void deposit(){ /* abstract method */ 
        System.out.println("Deposit Money");                     
    }                                                               }
    public void withdraw(){ /* non abstract method */              public void interest(){ /* abstract method*/ 
        System.out.println("Withdraw Money");                       
    }                                                               }
    public void interest(){ /* abstract method*/               }
    }
}                                                               interface class Sbi{
    class Bank extends Hdfc  {                                  public void loan(){ /* abstract method */ 
    }                                                                                 
                                                                   }
                                                                 public void homeloan(){/* abstract method */ }                                                                   }
                                                                    
                                                                }
                                                                
                                                                class Bank implements Hdfc, Sbi{ 
                                                                }
4. in abstract class can have final, non-final,                4. variables declared in a java interface are by default .
    static, non-static variables.                                    public static final .
    Syntax :                                                    Syntax : 
    abstract class Hdfc{                                        interface class Hdfc {
        public static int a;                                        public static final int a;
        public int b;                                               }
        public final int c;    
    }

5. in abstract class can have constructor.                      5. in interface class can not have any constructor. 


What is Abstruction ?

Data abstruction is the process of hidding certain details and showing only essential information to the user.
Abstruction can be achieved with either abstract class or interface.
   

