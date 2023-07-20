package inheritance.upCastingAndDownCasting;

public class Laptop extends Machine{
    public void doProgramming(){
        System.out.println(this.getClass().getName()+ " I am trying to learn programming");
    }

}
