Markdown# Week 2 – AP Lab (Java) Notes

## 1. Static Binding (Early Binding)
- **Definition**: Method call is resolved at **compile time**.
- **When it happens**:
  - Methods are `private`, `final`, or `static`.
  - Method overloading.
- **Advantages**:
  - Faster execution (no runtime lookup).
- **Example**:
  ```java
  class Test {
      static void display() {
          System.out.println("Static Binding Example");
      }
      public static void main(String[] args) {
          Test.display(); // Resolved at compile time
      }
  }


## 2. Dynamic Binding (Late Binding)

**Definition**: Method call is resolved at runtime based on the actual object type.
**When it happens**:

Method overriding in inheritance.
Non-static, non-final methods.


Advantages:

Supports runtime polymorphism.


Example:
 ```java
 Javaclass Parent {
    void show() {
        System.out.println("Parent's show()");
    }
 
 class Child extends Parent {
    void show() {
        System.out.println("Child's show()");
    }
}
 public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Resolved at runtime → "Child's show()"
    }
 }

## 3. Dynamic Method Dispatch

**Definition**: Mechanism by which a call to an overridden method is resolved at runtime.
Key Points:

Achieved through method overriding.
Reference type decides what members are accessible.
Object type decides which overridden method is executed.


Example:
 ```java
Javaclass Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}
public class Test {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound(); // Bark
        a = new Cat();
        a.sound(); // Meow
    }
}




## 4. Compile-time Polymorphism

Definition: Polymorphism achieved during compile time.
Achieved by:

Method Overloading (same method name, different parameters).


Example:Javaclass MathUtil {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}




## 5. Run-time Polymorphism

Definition: Polymorphism achieved during runtime.
Achieved by:

Method Overriding.


Example:Javaclass Shape {
    void draw() { System.out.println("Drawing Shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}




Summary Table



Feature
Static Binding / Compile-time Poly
Dynamic Binding / Run-time Poly




Resolution Time
Compile time
Runtime


Achieved By
Method overloading, static/final
Method overriding


Speed
Faster
Slower


Flexibility
Less flexible
More flexible


Example
static methods
Overridden methods





---

If you want, I can also make a **diagram-based Markdown** showing how **dynamic method dispatch** works visually — that would make your Week 2 notes even more exam-ready.  

Do you want me to add that?
