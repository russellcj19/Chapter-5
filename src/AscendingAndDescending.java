import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int userEntryOne;
        int userEntryTwo;
        int userEntryThree;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Ascending and Descending.\n");
        System.out.println("Enter a integer >>>\n");
        userEntryOne = input.nextInt();
        System.out.println("Enter another integer >>>\n");
        userEntryTwo = input.nextInt();
        System.out.println("Enter one last integer >>>\n");
        userEntryThree = input.nextInt();

        if(userEntryOne > userEntryTwo && userEntryOne > userEntryThree) {
            if (userEntryTwo > userEntryThree) {
                System.out.println("Here is your order >>>");
                System.out.println(userEntryOne + " " + userEntryTwo + " " + userEntryThree);
                }

                else
                System.out.println("Here is your order >>>");
            System.out.println(userEntryOne + " " + userEntryThree + " " + userEntryTwo);
        }
        else if(userEntryTwo > userEntryOne && userEntryTwo > userEntryThree){
            if (userEntryOne > userEntryThree){
                System.out.println("Here is your order >>>");
                System.out.println(userEntryTwo + "" + userEntryOne + " " + userEntryThree);
            }
            else
                System.out.println("Here is your order >>>");
            System.out.println(userEntryTwo + " " + userEntryThree + " " + userEntryOne);
        }
        else if (userEntryThree > userEntryOne && userEntryThree > userEntryTwo){
            if (userEntryTwo > userEntryOne){
                System.out.println("Here is your order >>>");
                System.out.println(userEntryThree + " " + userEntryTwo + " " +userEntryOne);
            }
            else
                System.out.println("Here is your order >>>");
            System.out.println(userEntryThree + " " + userEntryOne + " " + userEntryTwo);
        }


    }
}
