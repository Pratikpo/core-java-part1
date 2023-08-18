public class ExceptionHandlingUsingTryCatch {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int c=0;
        try{
         c=a/b;
            }//exception occur becoz divided by zero
        catch (ArithmeticException abc){
            System.out.println(abc.getMessage());
        }
        System.out.println(c);
        System.out.println("hello");

    }
}
