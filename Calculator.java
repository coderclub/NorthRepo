package MakeCalculator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.math.*;
import java.lang.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);   //Scanner class
        Scanner scan = new Scanner(System.in);

        String Answer;
        char firstchar;
        int NumofOp;


        do {
            System.out.println("\nWelcome to the Carlos's Calculator!\n\n");
            System.out.println("Press 1 for Addition.");
            System.out.println("Press 2 for Substraction.");
            System.out.println("Press 3 for Multiplication.");
            System.out.println("Press 4 for Division.");
            System.out.println("Press 5 for Future Value");
            System.out.println("Press 6 for Present Value. ");
            System.out.println("Press 7 for Sine, Cosine, and Tangent.");
            System.out.println("Press 8 for Exponents. ");
            System.out.println("Press 9 for Percentages");
            System.out.println("Press 10 for Logarithms\n");

            NumofOp = keyboard.nextInt();
            int getnum = NumofOp;

            switch (getnum) {    //switch case statement to run a loop.
                case (1):

                    Addnum(keyboard);
                    break;

                case (2):
                    Subnum(keyboard);
                    break;

                case (3):
                    Multnum(keyboard);
                    break;

                case (4):
                    Divnum(keyboard);
                    break;

                case (5):
                    Fvnum(keyboard);
                    break;

                case (6):
                    Pvnum(keyboard);
                    break;

                case (7):
                    Trigo(keyboard);
                    break;

                case (8):
                    exponNum(keyboard);
                    break;

                case (9):
                    Percentnum(keyboard);
                    break;
                case (10):
                    logNum(keyboard);
                default:
                    System.out.println("Please enter a valid number 1-10\n");
            }

            System.out.println("\n Would you like to try another Math problem? 'Y' for yes 'N' for no");
            Answer = scan.nextLine();
            firstchar = Answer.toUpperCase().charAt(0);

            //System.out.println(firstchar);
        }
        while (firstchar == 'Y');


    }

    public static void Addnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number to add \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("Give me another number to add");
        double SecondNum = keyboard.nextInt();

        Double SumOfNum;
        SumOfNum = FirstNum + SecondNum;

        //Answer
        System.out.println(FirstNum + " + " + SecondNum + " = " + SumOfNum);
    }

    public static void Subnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number to subtract \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("Give me another number to subtract");
        double SecondNum = keyboard.nextInt();

        Double SumOfNum;
        SumOfNum = FirstNum - SecondNum;

        //Answer
        System.out.println(FirstNum + " - " + SecondNum + " = " + SumOfNum);


    }

    public static void Multnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number to multiply \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("Give me another number to multiply");
        double SecondNum = keyboard.nextInt();

        Double SumOfNum;
        SumOfNum = FirstNum * SecondNum;

        //Answer
        System.out.println(FirstNum + " * " + SecondNum + " = " + SumOfNum);

    }

    public static void Divnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number to divide \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("Give me another number to divide");
        double SecondNum = keyboard.nextInt();

        double SumOfNum;
        SumOfNum = FirstNum / SecondNum;

        //Answer
        System.out.println(FirstNum + " / " + SecondNum + " = " + SumOfNum);


    }

    public static void Fvnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your future value: \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("What is your rate: \n");
        double SecondNum = keyboard.nextDouble();

        System.out.println("How many years: \n");
        int ThirdNum = keyboard.nextInt();

        Double SumOfNum;
        SumOfNum = FirstNum / Math.pow(1 + SecondNum, ThirdNum);

        //Answer
        System.out.println("The Future value of your future cashflow = " + " = " + SumOfNum + "\n");


    }

    public static void Pvnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your present value: \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("What is your rate: \n");
        double SecondNum = keyboard.nextDouble();

        System.out.println("How many years: \n");
        int ThirdNum = keyboard.nextInt();

        Double SumOfNum;
        SumOfNum = FirstNum / Math.pow(1 + SecondNum, ThirdNum);

        //Answer
        System.out.println("The Present value of your future cashflow = " + " = " + SumOfNum + "\n");


    }

    public static void Trigo(Scanner keybord) {
        Scanner NumInput = new Scanner(System.in);
        double firstNum = 0;

        double result = 0;

        System.out.println("Enter first number: ");
        firstNum = NumInput.nextDouble();

        System.out.println("type operator: sin, cos, tan \n");
        String amalgar = NumInput.next();

        if (amalgar.equalsIgnoreCase("sin")) {

            result = Math.sin(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);

        } else if (amalgar.equalsIgnoreCase("cos")) {


            result = Math.cos(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);

        } else if (amalgar.equalsIgnoreCase("tan")) {

            result = Math.tan(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);
        } else {
            System.out.println("type operator: sin, cos, tan \n");

        }

    }

    public static void exponNum(Scanner keybord) {
        Scanner NumInput = new Scanner(System.in);

        double firstNum;

        double ExponentNum;

        System.out.println("Write a number \n");
        firstNum = NumInput.nextDouble();

        System.out.println("To what power would you like the number raise to \n");
        ExponentNum = NumInput.nextDouble();


        double result = Math.pow(firstNum, ExponentNum);
        System.out.println("The number " + firstNum + " raised to the power of  " + ExponentNum + " is " + result);

    }

    public static void Percentnum(Scanner keybord) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number \n");
        double FirstNum = keyboard.nextInt();

        System.out.println("Give me another a total number to calculate percentage \n");
        double SecondNum = keyboard.nextInt();

        double PercentOfNum;
        PercentOfNum = ((FirstNum * 100) / SecondNum);

        //Answer
        System.out.println("The percentage of your two numbers is " + PercentOfNum + "%");


    }

    public static void logNum(Scanner keybord) {
        Scanner NumInput = new Scanner(System.in);
        double firstNum = 0;

        double result = 0;

        System.out.println("Enter a number: ");
        firstNum = NumInput.nextDouble();

        System.out.println("type operator: log, log10, inverse, ex \n");
        String amalgar = NumInput.next();

        if (amalgar.equalsIgnoreCase("log")) {

            result = Math.log(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);

        } else if (amalgar.equalsIgnoreCase("log10")) {


            result = Math.log10(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);

        } else if (amalgar.equalsIgnoreCase("inverse")) {

            result = Math.tan(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);
        } else if (amalgar.equalsIgnoreCase("ex")) {

            result = Math.exp(firstNum);
            System.out.println("The result of " + amalgar + " is " + result);
        } else {
            System.out.println("type operator: log, log10, inverse, ex \n");

        }

    }
}


