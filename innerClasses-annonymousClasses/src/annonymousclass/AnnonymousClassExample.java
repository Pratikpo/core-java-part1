package annonymousclass;

public class AnnonymousClassExample {
    //creating an annonymous class doesnt have a name but implements an interface
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            System.out.println("Run method called");
        }
    };

    public static void main(String[] args) {
        //to access run method we need runnable
        AnnonymousClassExample annonymousClassExample=new AnnonymousClassExample();
        annonymousClassExample.runnable.run();
    }
}
class RunnableExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Run method is called");
    }
}
