import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        int talkTime = 0;
        int textMesg = 0;
        int data = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome to Horizon Phones!! ");
        System.out.println("Today I will help you find the perfect monthly plan for you");
        System.out.println("How much Talk time do you need? >>> ");
        talkTime = input.nextInt();
        System.out.println("How many Text messages sent? >>>");
        textMesg = input.nextInt();
        System.out.println("How much Data? >>>");
        data = input.nextInt();
        if (talkTime < 500 && data+textMesg == 0)
            PlanA();
        else if (talkTime < 500 && data == 0 && textMesg <= 1000000)
            PlanB();
        else if(talkTime >= 500 && textMesg <= 100 && data == 0)
            PlanC();
        else if(talkTime >= 500 && textMesg >= 100 && data == 0)
            PlanD();
        else if(talkTime >= 500 && textMesg >= 100 && data <= 2)
            PlanE();
        else if(talkTime >= 500 && textMesg >= 100 && data >= 2)
            PlanF();



    }


    public static void PlanA(){
        System.out.println("Plan A is perfect for you! " +
                "Starting at $49 per month with fewer than 500 " +
                "minutes of talk time (no text or data)");
    }
    public static void PlanB(){
        System.out.println("Plan B is perfect for you! " +
                "Starting at $55 per month with more than " +
                "500 minutes of talk time and any amount of texts! and no data ");
    }
    public static void PlanC(){
        System.out.println("Plan C is perfect for you! " +
                "Starting at $61 per month with more than " +
                "500 minutes of talk time and up to 100 texts! and no data ");

    }
    public static void PlanD(){System.out.println("Plan D is perfect for you! " +
            "Starting at $70 per month with more than " +
            "500 minutes of talk time, more than 100 texts! and no data ");

    }
    public static void PlanE(){
        System.out.println("Plan E is perfect for you! " +
                "Starting at $79 per month with more than " +
                "500 minutes of talk time, more than 100 texts! and up to 2 GB of Data!!  ");

    }
    public static void PlanF(){
        System.out.println("Plan F is perfect for you! " +
                "Starting at $87 per month with more than " +
                "500 minutes of talk time, more than 100 texts! and MORE THAN 2 GB of Data!!  ");

    }
}

