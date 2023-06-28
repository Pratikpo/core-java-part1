import java.util.Scanner;

public class MenuDrivenExample {
    public static void main(String[] args) {
        String yesNo="yes";
        while (yesNo.equalsIgnoreCase("yes")){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter an input(day of week): ");
            String dayOfWeek = scanner.next();
            switch (dayOfWeek) {
                case "Monday":
                    System.out.println("Mondays are boring.");
                    break;
                case "Tuesday":
                    System.out.println("Tuesday Better than Monday.");
                    break;
                case "Wednesday":
                    System.out.println("Wednesday is Okays.");
                    break;
                case "Thursday":
                    System.out.println("Thursday is day that I go to office.");
                    break;
                case "Friday":
                    System.out.println("Summer Fridays are half days");
                    break;
                case "Saturday":
                    System.out.println("First day weekend");
                    break;
                case "Sunday":
                    System.out.println("Awesome day.");
                    break;
                default:
                    System.out.println("User has entered invalid input");
            }

            System.out.println("Do you want continue:\n 1.yes \n 2.no");
            yesNo = scanner.next();
        }
        }
    }
