/*
    exception is abnormal behaviour in program
    when an exception occur in program and it is not handled properly then
    The line below the exception do not get executed
    exception are two types
    1.compile type exception these exception are thrown while compiling the program
    2.run time exception -these exception are thrown while program executed


    In exception hierarchy Top level class is Throwable
    Exception class extends Throwable

    There are two ways to handle exception
    1.using try catch block
    2. using throws keyword with method example

 */
public class ExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=a/b; //exception occur becoz divided by zero
        System.out.println(c);
    }

}
