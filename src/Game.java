import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String scissors = "scissors";
        String rock = "rock";
        String paper = "paper";
        int playerCounter = 0;
        int yourCounter = 0;
        int draw = 0;

        System.out.print("Enter 'start' to play: ");
        String start = scanner.next();
        System.out.println("In order to finish the game type 'End'!");
        System.out.println();


        while (Objects.equals(start, "start")) {
                System.out.print("You: ");
                String choice = scanner.next();

                int player = random.nextInt(1, 4);
                switch (player) {
                    case 1:
                        if (Objects.equals(choice, scissors)) {       //case 1 = rock
                            System.out.println("Player: Rock");
                            System.out.println("Rock crashes Scissors. Player won!");
                            playerCounter++;
                        } else if (Objects.equals(choice, rock)) {
                            System.out.println("Player: Rock");
                            System.out.println("Draw!");
                            draw++;
                        } else if (Objects.equals(choice, paper)) {
                            System.out.println("Player: Rock");
                            System.out.println("Paper covers Rock. You won!");
                            yourCounter++;
                        }
                        break;
                    case 2:
                        if (Objects.equals(choice, scissors)) {       //case 2 = scissors
                            System.out.println("Player: Scissors");
                            System.out.println("Draw!");
                            draw++;
                        } else if (Objects.equals(choice, rock)) {
                            System.out.println("Player: Scissors");
                            System.out.println("Rock crashes Scissors. You won!");
                            yourCounter++;
                        } else if (Objects.equals(choice, paper)) {
                            System.out.println("Player: Scissors");
                            System.out.println("Scissors cut Paper. Player won!");
                            playerCounter++;
                        }
                        break;
                    case 3:
                        if (Objects.equals(choice, scissors)) {       //case 3 = Paper
                            System.out.println("Player: Paper");
                            System.out.println("Scissors cut Paper. You won!");
                            yourCounter++;
                        } else if (Objects.equals(choice, rock)) {
                            System.out.println("Player: Paper");
                            System.out.println("Paper covers Rock. Player won!");
                            playerCounter++;
                        } else if (Objects.equals(choice, paper)) {
                            System.out.println("Player: Paper");
                            System.out.println("Draw");
                            draw++;
                        }
                        break;
                }
                System.out.println();
                    if (Objects.equals(choice, "End")){
                        System.out.println();
                        System.out.println("Results:");
                        System.out.println("        Player won " + playerCounter + " times!");
                        System.out.println("        You won " + yourCounter + " times!");
                        System.out.println("        Draw " + draw + " times!");
                        break;
                    }
        }
    }
}
