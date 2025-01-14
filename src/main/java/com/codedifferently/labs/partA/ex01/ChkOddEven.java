package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(int num){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        if (num % 2 == 0) {
            response = "The num " + num + " is even";
        } else {
            response = "The num " + num + " is odd";
        }

        return response;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = scanner.nextInt();
        System.out.println(oddEven(num));

    }
}
