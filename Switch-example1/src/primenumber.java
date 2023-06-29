import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        String yesno = "yes";
        while (yesno.equalsIgnoreCase("yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            boolean isprime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(num + "\tIt is prime number.");
            } else {
                System.out.println(num + "\tIt is not prime number");
            }
            System.out.println("Do you want to continue \n 1.yes \n 2.no");
            yesno = scanner.next();

        }
    }
}