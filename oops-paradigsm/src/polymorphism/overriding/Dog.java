package polymorphism.overriding;

public class Dog extends Animal {
    Dog walk() {
        System.out.println("Dog is walking.");
        return new Dog();
    }
    void run(String msg) {
        System.out.println("Dog is running.");
    }

}
