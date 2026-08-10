//inheritence 
//main.java

public class Main
{
	public static void main(String[] args) {
		Mother m = new Child();
		m.show();
		
	}
}

// child.java

class Child extends Mother{
    void show(){
        System.out.println("child class method priority over parent one");
    }
}
// mother.java without constructor
class Mother{
    void show(){
        System.out.println("base class Mother");
    }
}
//mother with constructor
class Mother{
    Mother(){
       System.out.println("constructor class Mother");
    }
    void show(){
        System.out.println("base class Mother");
    }
}
