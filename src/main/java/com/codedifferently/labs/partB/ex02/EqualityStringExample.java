package com.codedifferently.labs.partB.ex02;

public class EqualityStringExample { //creates parent class
    public static String equality(){ //creates equality method class
        String response = ""; //creates an empty string named response

        String name1 = "Fred Smith"; //creates string named name1
        String name2 = "Sam Smith"; //creates string named name2

        if (name1.equals(name2)) { //if name1 is the same as name2
            response+= ("Same name."); //response equals "Same name."
        } else { //if nothing else then
            response+= ("Different name."); //response equals "Different name."
        } //closes if statement

        return response; //returns response string
    } //closes equality method class
    public static void main(String args[]) { //creates main class
        String equalityOutput = equality(); //sets string equal to equality output
        System.out.print(equalityOutput); //prints out previous string
    } //closes main class
} //closes parent class
