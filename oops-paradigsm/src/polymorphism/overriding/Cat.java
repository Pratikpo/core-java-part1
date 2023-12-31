package polymorphism.overriding;
/*
 Method overriding means having another method in child class with same signature.
 Method overriding means providing different method definition.
 What is same signature -
    - The number of parameters must be same
    - The sequence of parameters must be same
    - The type of parameters must be same

    Note-The return type must be same as parent method or subtype of parent method.
    Note-The access level should be same or higher.
    Note-For method overriding inheritance is must.
 */

public class Cat extends Animal {

    Cat walk() {
        System.out.println("Cat is walking");
        return new Cat();
    }

    void run(String msg) {
        System.out.println("cat is running"+msg);
    }

}
