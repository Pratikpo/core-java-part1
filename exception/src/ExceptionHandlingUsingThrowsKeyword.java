public class ExceptionHandlingUsingThrowsKeyword {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int c=0;
        try {
            c = getC(a, b);
        }
        catch (ArithmeticException abc){
            System.out.println(abc.getMessage());
        }
        finally {
            //finally is used to free resources
            //Here resources means database connection or file connection or sockets.
            System.out.println("finally block always gets exrcuted not matter exception occur or not ");
        }
        System.out.println(c);
        System.out.println("hello");

    }
    private static int getC(int a,int b) throws ArithmeticException{
        int c=0;
        c=a/b;
        System.out.println("getC method called");
        return 0;
    }
}
