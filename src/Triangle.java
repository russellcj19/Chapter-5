

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {


        int choice=0;
        Scanner input = new Scanner(System.in);
        while(choice !=999){
            System.out.println("What type of triangle are you solving for?");
            System.out.println("1. Right Triangle");

            System.out.println("2. Isoceles Triangle");
            System.out.println("3. Equalateral Triangle");
            System.out.println(" 999 to quit.");

            choice = input.nextInt();

            if (choice == 1)
                rightTriangle();
            else if (choice == 2)
                isoscelesTriangle();
            else if (choice == 3)
                equilateralTriangle();
        }
        System.out.println("Hope you got your answer.");

    }
    public static void isoscelesTriangle(){
        //triangle with two equal sides always try to find the base and area
        Scanner input = new Scanner(System.in);
        double base;
        double height;
        double area;
        int sideChoice;

        System.out.println("What are you trying to find? The base *(press 1)* or the area *(press 2)*");
        sideChoice = input.nextInt();

        if (sideChoice == 1){
            theEquation();

        }
        else if (sideChoice == 2){
            System.out.println("What is side base? >>>");
            base = input.nextDouble();
            System.out.println("What is side height? >>>");
            height = input.nextDouble();

            area = (base * height) / 2;

            System.out.println("The area of the triangle is " + area);

        }

        }

    public static void equilateralTriangle(){
        //all sides are equal find the perimeter and height
       Scanner input = new Scanner(System.in);
        double perimeter = 0;
        int sideChoice;
        double[] sideArray = new double[3];


        System.out.println("What are you trying to find? The perimeter *(press 1)* or the height *(press 2)*");
        sideChoice = input.nextInt();

        if (sideChoice == 1){
            for(int i = 0; i < 3; i++){
                System.out.println("What is side " + i + "? >>>");
                sideArray[i] = input.nextDouble();
                perimeter = sideArray[i] + perimeter;
                System.out.println("The perimeter is " + perimeter);
            }

            }else if (sideChoice == 2){
            theEquation();
            }
                }




    public static void rightTriangle(){
       theEquation();
    }

    public static void calculateSideA(double b, double c, String choice) {
        double a;

        a = Math.sqrt(c * c - b * b);
        System.out.println("The side " + choice + " = " + a);

    }

    public static void calculateSideB(double c, double a, String choice) {
        double b;

        b = Math.sqrt(c * c - a * a);
        System.out.println("The side " + choice + " = " + b);
    }

    public static void calculateSideC(double a, double b, String choice) {
        double c;

        c = Math.sqrt(a * a + b * b);
        System.out.println("The side " + choice + " = " + c);
    }
    public static void triangleDoesNotExit(){
        System.out.println("The side does not exist on a triangle!");
    }
    public static void theEquation(){
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice2;
        String sideChoice;



        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();

            calculateSideA(sideB, sideC, sideChoice);

        } else if (sideChoice.equals("B")) {
            System.out.println("What is side A? >>>");
            sideA = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();

            calculateSideB(sideA, sideC, sideChoice);

        } else if (sideChoice.equals("C")) {
            System.out.println("What is side A? >>>");
            sideA = input.nextDouble();
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();

            calculateSideC(sideA, sideB, sideChoice);

        } else
            triangleDoesNotExit();
    }
}
