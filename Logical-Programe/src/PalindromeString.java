import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesno = "yes";
        while (yesno.equalsIgnoreCase("yes")) {
            System.out.println("Enter your string: ");

            String line = scanner.nextLine();
            String rev = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                rev = rev + line.charAt(i);
            }
            if (rev.equals(line)) {
                System.out.println("your string is Palindrome");
            } else {
                System.out.println("your string is not palindrome");
            }
            System.out.println("if you want to continue \n1.yes\n2.no");
            yesno = scanner.nextLine();
        }
    }
}