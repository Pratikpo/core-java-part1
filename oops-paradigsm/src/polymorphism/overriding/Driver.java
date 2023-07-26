package polymorphism.overriding;

public class Driver {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.run("walk");
        Cat c = new Cat();
        c.walk();
        c.run("run");
    }
}
