public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();//tight coupling
        machine.powerOn();
        machine.reboot();
        machine.powerOff();

        IMachine iMachine=new Machine();//loose coupling
        iMachine.powerOff();
        iMachine.powerOn();


    }
}
