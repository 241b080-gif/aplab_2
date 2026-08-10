//diffrent parameter for function time overloading 
class Mother{
    void show(){
        System.out.println("base class Mother");
    }
    void show(int x){
        System.out.println("class Mother");
    }
}

//function overriding
class Animal {
   void sound() {
       System.out.println("Animal makes a sound");
   }
}
class Dog extends Animal {
   @Override
   void sound() {
       System.out.println("Dog barks");
   }
}
public class Main {
   public static void main(String[] args) {
       Animal a = new Animal();
       a.sound(); // Calls Animal's method
       Dog d = new Dog();
       d.sound(); // Calls Dog's overridden method
       Animal ad = new Dog();
       ad.sound(); // Calls Dog's overridden method (runtime polymorphism)
   }
}
