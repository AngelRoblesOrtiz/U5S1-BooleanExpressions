package com.codedifferently.labs.partB.ex04;

public class IfDemo { //creates the parent class

    public static String drivingAge(){ //creates the drivingAge method class
        String response = ""; //creates empty response string

        boolean drivingUnderAge; //creates boolean val with no val

        int age = 15; //creates integer equal to 15

        if (age <= 16) { //if age is less than or equal to 16
            drivingUnderAge = true; // then driving age is true
            response += ("Was Driving Under Age: " + drivingUnderAge); //and response prints this
        } //closes if statement

        return response; //returns response string
    } //closes the drivingAge method class

    public static void main(String args[]) { //creates the main class
        String drivingOutput = drivingAge(); //sets the string equal to drivingage output
        System.out.println(drivingOutput); //prints out the string


    } //closes the main class
} //closes the parent class
