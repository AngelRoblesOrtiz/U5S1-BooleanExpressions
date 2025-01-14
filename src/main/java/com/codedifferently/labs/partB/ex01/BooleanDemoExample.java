package com.codedifferently.labs.partB.ex01;

public class BooleanDemoExample { //creates the parent class

    public static String bool(){ //creates the bool method
        String response= ""; //creates empty string response

        boolean passed, largeVenue, grade; //creates 3 booleans

        passed = true; //sets passed to be true
        largeVenue = false; //sets largeVenue to be false
        grade = passed; //sets grade to be true

        response += (passed) + "\n"; //adds true to the once empty string
        response += (largeVenue)+ "\n"; //add false to the string
        response += (grade); //adds true to the string

        return response; //returns the string
    } //closes the method
    public static void main(String args[]) { //creates the main class
        String booleanOutput = bool(); //sets string equal to method output
        System.out.println(booleanOutput); //prints out the string

    } //closes the main class
} //closes the parent class
