// Print out the following pattern:
//*
//**
//***
//##
//#

class Main {
  public static void main(String[] args) {
    //write your code here!

        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 1; i <= 2; i++)
        {
          for (int j = 2; j >= i; j--)
          {
                System.out.print("#");
            }
            System.out.println("");
      }
    }
  }
