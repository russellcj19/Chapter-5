import java.util.Scanner;

public class PickaNumber1to10 {
    public static void main(String[] args){
        int userGuess = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game/n.");
        System.out.println("Pick a number between 1 and 10\n");
        System.out.println("Guess correctly and win a prize.\n");



        int random = (int)(Math.random() * 10 + 1);

        while(userGuess != random) {
            System.out.print("Pick a number ");
            userGuess = input.nextInt();
            if (userGuess == random) {
                System.out.println("You Guess Correctly!!");
            } else if (userGuess > random) {
                System.out.println("Wrong number it was to high");
            } else if (userGuess < random) {
                System.out.println("Wrong number it was to low");
            } else {
                System.out.println("That number was outside of 1 - 10"); }
            count = count +1;
        }

        System.out.println("You guessed in " + count + " tries");

    }

}
