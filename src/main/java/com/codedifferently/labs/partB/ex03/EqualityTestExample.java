package com.codedifferently.labs.partB.ex03;

public class EqualityTestExample { //creates the parent class
    public static String nameCheck(){ //creates the nameCheck method class
        String response = ""; //creates empty response string

        int value1 = 15; //creates integer equal to 15
        int value2 = 24; //creates integer equal to 24
        boolean res1 = value1 == 15; // creates boolean equal to the outcome of value1 being equal to 15
        response += ("res1:" + res1); //sets response to a string and a boolean
        boolean res2 = value1 == value2; //creates a boolean dependent on if val1 and val2 are equal
        response += ("res2: " + res2); //adds to response a string and boolean val


        return response; //returns the response

    } //closes the nameCheck metho class

    public static void main(String args[]) { //creates the mainc alss
       String output = nameCheck(); //sets a string to the output of namecheck class
        System.out.println(output); //prints the string
    } //closes main class
} //closes parent class
