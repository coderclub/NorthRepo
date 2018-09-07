package Proj2;
import java.util.Scanner;

public class Gpa {



        public static void main(String[] args) {



            Scanner keyboard = new Scanner(System.in);

            double grade1;

            double grade2;

            double grade3;

            double GPA;



            System.out.println("What is your first test score? ");

            grade1 = keyboard.nextDouble();



            System.out.println("What is your second test score? ");

            grade2 = keyboard.nextDouble();



            System.out.println("What is your first test score? ");

            grade3 = keyboard.nextDouble();



            GPA = (grade1+grade2+grade3)/3;

            System.out.printf("Your GPA is "+ "%.2f",GPA);



            if(GPA>=90.0){

                System.out.println("\n"+"You have a A average");

            }

            else if(GPA>=80.0 && GPA < 90.0)

            {

                System.out.println("\n"+"You have a B average");

            }

            else if(GPA>=70.0 && GPA < 80.0)

            {

                System.out.println("\n"+"You have a C average");

            }

            else if(GPA>=60.0 && GPA < 70.0)

            {

                System.out.println("\n"+"You have a D average");

            }

            else{

                System.out.println("\n"+"You have a F average");

            }



        }}

