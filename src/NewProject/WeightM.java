package NewProject;

import java.util.Scanner;

public class WeightM {

    public static void main(String[] args) {



            Scanner keyboard = new Scanner(System.in);

            double Mass;

            double Weight;



            System.out.println("What is the mass of the object? "+"\n");

            Mass = keyboard.nextDouble();



            Weight = Mass * 9.8;

            System.out.println("The weight of this object is "+

                    Weight + " Newtons");



            if(Weight <= 10.0)

            {

                System.out.println("\n"+"Object is too light");

            }

            else if(Weight >= 1000.0)

            {

                System.out.println("\n"+"Object is too heavy");

            }

            else

            {
                System.out.println("\n"+"");

            }

        }
    }


