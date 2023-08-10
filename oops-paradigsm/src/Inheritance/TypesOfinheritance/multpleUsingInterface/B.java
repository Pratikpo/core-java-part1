package inheritance.TypesOfinheritance.multpleUsingInterface;

public class B extends A {
    @Override
    void display() {
        super.display();
        System.out.println("display method called from A class");
    }
}