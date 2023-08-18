// error in the program is abnormal condition where can  not be handled or covered
//error
/*
Error - an error in the program is an abnormal condition that can not be handled or recovered.
        Error's parent class is Throwable.

        Some Error subclasses are :-
        1. MemoryOutOfError
        2. StackOverflowError
        3. JavaVirtualMachineError
*/
public class Error {

    public static void main(String[] args) {
        while(true){
            sayhello();
        }

    }
    static void sayhello(){
        System.out.println("Hello infinite times");
        sayhello();
    }
}
