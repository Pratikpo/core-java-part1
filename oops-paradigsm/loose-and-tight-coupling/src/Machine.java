
//this class is only resposible for methods of imachine interface
public class Machine implements IMachine {

    @Override
    public void powerOn() {
        System.out.println("powering on machine");
    }

    @Override
    public void powerOff() {
        System.out.println("powerinf off machine");

    }
    public void reboot(){
        System.out.println("rebooting machine");
    }
}
