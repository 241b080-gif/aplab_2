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
    
}

//mother.java
class Mother{
    Mother(){
        System.out.println("hello default call from constructor");
    }
    void show(){
        System.out.println("base class Mother");
    }
}
