import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args){

            int ViewChoice = 0;
            int ParkingChoice = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Hello and welcome to Summerdale Condo Sales office!! ");
            System.out.println("Today I will help you find the perfect condo for you!");
            System.out.println("What view are you looking for? Park View (Press 1)," +
                    " Golf Course View (Press 2), or Lake View (Press 3)");
            ViewChoice = input.nextInt();
            System.out.println("What type of parking are you looking for, " +
                    "garage space (Press 1) or just a parking space (Press 2)");
            ParkingChoice = input.nextInt();

            if (ViewChoice == 1 && ParkingChoice == 1)
                PriceA();
            else if (ViewChoice == 1 && ParkingChoice >= 2)
                PriceB();
            else if (ViewChoice == 2 && ParkingChoice == 1)
                PriceC();
            else if (ViewChoice == 2 && ParkingChoice >= 2)
                PriceD();
            else if (ViewChoice == 3 && ParkingChoice == 1)
                PriceE();
            else if (ViewChoice == 3 && ParkingChoice >= 2)
                PriceF();
            else if (ViewChoice >= 4)
                Invaild();
        }

    public static void PriceA(){
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Park view and garage parking... Your total is $155,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);

    }


    public static void PriceB(){
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Park view and standard parking... Your total is $150,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
    public static void PriceC() {
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Golf Course View and garage parking... Your total is $175,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
    public static void PriceD() {
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Golf Course View and standard parking... Your total is $170,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
    public static void PriceE() {
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Lake View and garage parking... Your total is $215,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
    public static void PriceF() {
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("You chose a Lake View and standard parking... Your total is $210,000");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
    public static void Invaild() {
        Scanner input = new Scanner(System.in);
        int restart;
        System.out.println("Price = $0");
        System.out.println("Thank You For Shopping! (Press 999 to restart)");
        restart = input.nextInt();
        if (restart == 999)
            main(null);
    }
}
