package com.codedifferently.labs.partB.ex03;
import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        /* Put your code in between these comments : Top */
        System.out.println("What is your first name? Type below: ");
        String firstName = scanner.nextLine().toLowerCase();
        if (firstName.equals("elvis")) {
            response = "You are the king of rock and roll";
        } else {
            response = "You are not the king";
        }
        /* Put your code in between these comments : Bottom */



        return response;

    }

    public static void main(String args[]) {
        String name = "";
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */


        String responseToName  = nameCheck(name);
        System.out.println(responseToName);
    }

}
