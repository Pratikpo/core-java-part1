package inheritance.TypesOfinheritance.multpleUsingInterface;

public class D extends B implements C {
    @Override
    public void display() {//this display is coming from interface C.
        super.display();
        System.out.println("display method called from A class");
    }
}