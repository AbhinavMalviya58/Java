import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Welcome to Rock-Paper-Scissors game!");

        while (true) {
            System.out.print("Enter your choice (rock, paper, scissors) or 'quit' to exit: ");
            String userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input! Please enter either 'rock', 'paper', 'scissors', or 'quit'.");
                continue;
            }

            int randomIndex = random.nextInt(choices.length);
            String computerChoice = choices[randomIndex];
            System.out.println("Computer chooses: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}