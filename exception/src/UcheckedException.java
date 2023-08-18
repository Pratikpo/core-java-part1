public class UcheckedException {
    public static void main(String[] args) {
        try{
            int numArray[] ={1,2,3,4,5};
            System.out.println("value at index 10 in numArray"+ numArray[10]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Arrayindexoutofboundsexception occured:" +arrayIndexOutOfBoundsException);
        }

        System.out.println("rest of code!!!");
    }
}
