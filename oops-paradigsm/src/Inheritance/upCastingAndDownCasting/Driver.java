package inheritance.upCastingAndDownCasting;

public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.startUp();
        machine.shutDown();

        Laptop laptop = new Laptop();
        laptop.startUp();
        laptop.doProgramming();
        laptop.shutDown();

        Printer printer=new Printer();
        printer.startUp();
        printer.print();
        printer.shutDown();

        Machine laptop1 =new Laptop();  //upcasting
        // in upcasting you create an object of child class and assign it to parent class to reference variable
        //every laptop will be a machine
        laptop1.startUp();
        laptop1.shutDown();


        Machine printer1 =new Printer();//upcasting
        printer1.startUp();
        printer1.shutDown();


        /* In downcasting you create an object of parent class and assign
        it to child class reference variable
         */


        Laptop laptop2 = (Laptop) new Machine();//downcasting
        laptop2.startUp();
        //laptop2.doProgramming();
        laptop2.shutDown();

    }
}
