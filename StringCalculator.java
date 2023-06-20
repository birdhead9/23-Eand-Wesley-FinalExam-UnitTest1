package org.example;

public class StringCalculator {

    public static int add(final String numbers){
        int returnValue =0;
        String[] numbersArray = numbers.split(",|\n");
        for(String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        //added functionality of not allowing a negative number
        //or ignoring a number that is greater than 1000
        if(returnValue <0){
            throw new RuntimeException("Negatives not allowed");

        }else if(returnValue >1000){
            returnValue =1;

        }

        return returnValue;
    }

}