import java.util.Scanner;

public class RockPaperSissors {
    public static void main(String[] args) {
        int userEntry = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Rock, Paper, and Scissors.\n");

        int random = (int) (Math.random() * 3 + 1);
        while (userEntry != random) {
            System.out.println("Choose either rock (press 1), paper (press 2)" +
                    " or scissors(press 3) >>>\n");
            userEntry = input.nextInt();
            if (userEntry == 1) {
                if (random == 1) {
                    System.out.println("Rock and Rock is a Tie...");
                } else if (random == 2) {
                    System.out.println("Paper beats Rock, You LOST...");
                } else{
                    System.out.println("Rock beats Scissors, You win!");
                }

            }
            else if (userEntry == 2){
                if (random == 1) {
                    System.out.println("Paper beats Rock, You Win!");
                } else if (random == 2) {
                    System.out.println("Paper and Paper is a Tie...");
                } else{
                    System.out.println("Scissors beats Paper, You LOST...");
                }
            }
            else if (userEntry == 3){
                if (random == 1) {
                    System.out.println("Rock beats Scissors, You LOST...");
                } else if (random == 2) {
                    System.out.println("Scissors beats Paper, You Win!");
                } else {
                    System.out.println("Scissors and Scissors is a Tie...");
                }
            }

        }
    }
}
