import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args){

        int age;
        String result = null;
        String job;
        String children;
        String retirement;
        String bingo;
        Scanner input = new Scanner(System.in);
        System.out.println("Welsom to my age insult generator.");
        System.out.println("Please enter your age >>>>>>>");
        age = input.nextInt();

        if(age <= 12) {
            result = "You are not a teenager and probably needs to use deoderant.";
        }
        else if(age > 12 && age < 20){
            result = "You might be a teenager";

        }
        else if (age >= 21 && age < 30){
            result = "I hope you went to college and got a job!";
            System.out.print("Did you get a job >>>>");
            job = input.next();
            if(job == "yes"){
                result = "Yes, I have a job";
            }
            else
                result = "No, I am a dead beat";
        }
        else if  (age > 31 && age <40){
            result = " I hope you have children";
            System.out.print("Do you have children >>>>");
            children = input.next();
            if(children == "yes"){
                result = "Yes, I love them";
            }
            else
                result = "No, I am still a dead beat ";
            } else if  (age > 41 && age <50){
            result = " I hope you are readey for retierment ";
            System.out.print("Are you retiering soon >>>>");
            retirement = input.next();
            if(retirement == "yes"){
                result = "Yes, I will be retireing soon";
            }
            else
                result = "No, I couldn't hold a steady job";
        }
        else if  (age > 51 && age <60){
            result = " I bet you love BINGO";
            System.out.print("Do you play BINGO >>>>");
            bingo = input.next();
            if(bingo == "yes"){
                result = "Yes, I love BINGO it's the best";
            }
            else
                result = "No, I am a dead beat and have no luck";
        }

        }
    }
//; {String result;
    //;    displayMessage(result);
       //; }
       //; public viod displayMessage(String result){
    //; System.out.println(result);
       //;  }


