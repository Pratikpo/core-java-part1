import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] choices = {"rock","paper","scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lets's play rock,paper,scissors");

        int i =3;
        int j=1;
        while (j<=i) {
            System.out.println("Round" + j);
            System.out.println("Enter your choice(rock,paper,scissors:)");
            String playerchoice = scanner.nextLine();

            if (playerchoice.equals("rock") || playerchoice.equals("paper") || playerchoice.equals("scissors")) {
                int randomeindex = random.nextInt(choices.length);
                String computerChoices = choices[randomeindex];
                System.out.println("computer's choice :" + computerChoices);
                System.out.println("Your choice:" + playerchoice);
                if (playerchoice.equals(computerChoices)) {
                    System.out.println("It is tie");
                } else if ((playerchoice.equals("rock") && computerChoices.equals("scissors"))
                        || (playerchoice.equals("paper") && computerChoices.equals("rock"))
                        || (playerchoice.equals("scissors") && computerChoices.equals("rock"))) {
                    System.out.println("You win");

                } else {
                    System.out.println("You loose and computer win");
                }
                j++;

            } else {
                System.out.println("Invalid input");
            }
        }
        scanner.close();
    }
}