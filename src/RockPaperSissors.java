import java.util.Scanner;

public class RockPaperSissors {
    public static void main(String[] args) {
        int userEntry = 0;
        int winTotal = 0;
        int tieTotal = 0;
        int loseTotal = 0;
        int totalGamesPlayed = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Rock, Paper, and Scissors.\n");

        while (userEntry != 999)
        {
            int random = (int) (Math.random() * 3 + 1);

            System.out.println("Choose either: rock (press 1), paper (press 2)" +
                    " or scissors(press 3) >>>\n");

            userEntry = input.nextInt();
            if (userEntry == 1) {
                if (random == 1) {
                    System.out.println("Rock and Rock is a Tie...");
                    tieTotal++;
                } else if (random == 2) {
                    System.out.println("Paper beats Rock, You LOST...");
                    loseTotal = loseTotal + 1;
                } else{
                    System.out.println("Rock beats Scissors, You win!");
                    winTotal = winTotal + 1;
                }

            }
            else if (userEntry == 2){
                if (random == 1) {
                    System.out.println("Paper beats Rock, You Win!");
                    winTotal = winTotal + 1;
                } else if (random == 2) {
                    System.out.println("Paper and Paper is a Tie...");
                    tieTotal++;
                } else{
                    System.out.println("Scissors beats Paper, You LOST...");
                    loseTotal = loseTotal + 1;
                }
            }
            else if (userEntry == 3){
                if (random == 1) {
                    System.out.println("Rock beats Scissors, You LOST...");
                    loseTotal = loseTotal + 1;
                } else if (random == 2) {
                    System.out.println("Scissors beats Paper, You Win!");
                    winTotal = winTotal + 1;
                } else {
                    System.out.println("Scissors and Scissors is a Tie...");
                    tieTotal++;
                }
            }
            totalGamesPlayed++;

        }
        System.out.println("Thanks for playing!! Check out your Stats Below ");
        System.out.println("Win Total = " + winTotal + "\nLose Total = " + loseTotal +
        "\nTie Total = " + tieTotal + "\nTotal Games Played = " + totalGamesPlayed);

        System.out.println("*******************Display Graph************************");
        System.out.print("W "); displayBar(winTotal);
        System.out.print("L "); displayBar(loseTotal);
        System.out.print("T "); displayBar(tieTotal);
    }
    public static void displayBar(int b) {
        for(int i = 0; i < b; ++i){
            System.out.print("#");
        }
        System.out.println();
    }
}
