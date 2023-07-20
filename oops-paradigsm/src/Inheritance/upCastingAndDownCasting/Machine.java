package inheritance.upCastingAndDownCasting;
//
public class Machine {
    public void startUp(){
        System.out.println(this.getClass().getName()+ " Machine is starting up.");
    }
    public void shutDown(){
        System.out.println(this.getClass().getName()+ " Machine is shutDown");
    }

}

