public class LoopsExample {

    public static void main(String[] args) {


        System.out.println("Prime numbers between 1 to 100 " );

        //loop through the numbers one by one
        for(int i=2; i < 100; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if(isPrime)
                System.out.print(i+" ");
        }
    }
}