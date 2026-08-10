public class Main
{
	public static void main(String[] args) {
		Mother m = new Child();
		m.show();
		
	}
}

class Child extends Mother{
    Child(){
        super(3);
    }
    
}

class Mother{
    Mother(int x){
        System.out.println("hello");
    }
    void show(){
        System.out.println("Mother");
    }
}
