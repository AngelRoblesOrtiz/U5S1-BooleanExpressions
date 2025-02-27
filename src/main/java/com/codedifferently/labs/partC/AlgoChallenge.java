package com.codedifferently.labs.partC;

public class AlgoChallenge {

      /* Problem 1
    Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
    But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
    He needs your help to make sure the list of given phrases begin with what was asked.
    Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"
    startWithIx("mix snacks") --> true
    startWithIx("pix snacks") --> true
    startWithIx("piz snacks") --> false
     */

    public static Boolean startWithIx(String phrase) {
        boolean response;
        String ix = phrase.substring(1, 3);

        if (ix.equals("ix")) {
            response = true;
        } else {
            response = false;
        }

        return response;
    }

     /* Problem 1
    Provide two numbers, evaluate both numbers to see which one is nearest to the value 10.
    Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
    In that case, we would consider that event a tie.
    Tip: Math.abs(n) returns the absolute value of a number
    Return whichever number is nearest to 10, or return 0 for the event of a tie.
    near10(8, 13) --> 8
    near10(13, 8) --> 8
    near10(13, 7) --> 0
     */

    public static Integer near10(int one, int two){
        int one1 = one;
        int two1 = two;

        if (one < 10) {
            one1 = one - 10;
        } else {
            one1 = 10 - one;
        }

        if (two < 10) {
            two1 = two - 10;
        } else {
            two1 = 10 - two;
        }

        if (one1 == two1) {
            return 0;
        } else if (one1 > two1) {
            return one;
        } else if (two1 > one1) {
            return two;
        }
        return null;
    }

}
