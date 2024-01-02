

//Use of Super Keyword 

//PARENT CLASS
/*
class Box{
    int hight;
    int length;
    int width;
    
    //Non-parameterized constructor
    Box(){
       this.hight=0;
       this.length=0;
       this.width=0;
    }
    //parameterized constructor
    Box(int hight, int length, int width){
        this.hight=hight;
       this.length=length;
       this.width=width;
        
    }
}
// CHILD CLASS
class BoxWigth extends Box{
    int wight=0;
    //Non-parameterized constructor
    BoxWigth(){
       this.wight=0;
    }
    //parameterized constructor
    
    BoxWigth(int hight, int length, int width,int wight){
        super(hight,length,width);
        this.wight=wight;
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name(parameter, parameter);
	    Box b1=new Box(10, 20, 30);
	    System.out.println("Hight "+b1.hight+ " Length "+b1.length+" Width "+b1.width);
	    
	    BoxWigth bw1=new BoxWigth(40,80,120,50);
	   
	    System.out.println("Hight "+bw1.hight+ " Length "+bw1.length+" Width "+bw1.width+" Wight "+bw1.wight);
	}
}
*/

//Use of Super Keyword
//PARENT CLASS

class Box{
    int hight;
    int length;
    int width;
    
    //Non-parameterized constructor
    Box(){
       this.hight=0;
       this.length=0;
       this.width=0;
    }
    //parameterized constructor
    Box(int hight, int length, int width){
        this.hight=hight;
       this.length=length;
       this.width=width;
        
    }
    public void eating(){
        System.out.println("I am eating parent class");
    }
    
    public void talking(){
        System.out.println("I am talking parent class");
    }
}
// CHILD CLASS
class BoxWigth extends Box{
    int wight=0;
    //Non-parameterized constructor
    BoxWigth(){
       this.wight=0;
    }
    //parameterized constructor
    
    BoxWigth(int hight, int length, int width,int wight){
        super(hight,length,width);
        this.wight=wight;
        
    }
        public void eating(){
        System.out.println("I am eating child class");
    }
    
    public void show(){
        this.eating();                  // child class function.
        super.eating();                 // parent class function.
        super.talking();                // parent class function.
    }
}
public class Main
{
	public static void main(String[] args) {
	    //Object syntax:  class_name Object_name = new class_name(parameter, parameter);
	    Box b1=new Box(10, 20, 30);
	    System.out.println("Hight "+b1.hight+ " Length "+b1.length+" Width "+b1.width);
	    
	    BoxWigth bw1=new BoxWigth(40,80,120,50);
	   
	    System.out.println("Hight "+bw1.hight+ " Length "+bw1.length+" Width "+bw1.width+" Wight "+bw1.wight);
	    
	    bw1.show();
	}
}

