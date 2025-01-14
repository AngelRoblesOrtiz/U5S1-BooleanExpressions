package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality(){
        String response = "";
        String num1 = "4";
        String num2 = "5";

        /* Your code goes here*/
        boolean tof = false;
        if (num1.equals(num2)) {
            tof = true;
            response += "Are " + num1 + " and " + num2 + " equal? " + tof;
        } else {
            response += "Are " + num1 + " and " + num2 + " equal? " + tof;
        }

        return response;
    }
    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.print(equalityOutput);
    }
}
