package DataStructure;

import java.util.Scanner;

public class Authentication {
    Registration Reg = new Registration();

    public void greetings() {
        Reg.welcomeMessage();
        System.out.println("Java Connect");
    }

    public class Registration {
        private void welcomeMessage() {
            System.out.println("Welcome to Java");
        }

        public void emailInput() {
            Scanner sc = new Scanner(System.in);
            String email = sc.next();
            char email_id = '@';
           // char data = email.charAt(email_id);
            System.out.println("Your email " + email + " has been accepted");
        }
    }

    public static class Login {
        public static void loginPromt() {
            System.out.println("Please enter your username");
        }

    }
}


