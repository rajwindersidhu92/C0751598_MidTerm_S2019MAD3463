package com.lambton;

public class LambtonStringTools {

    public void reverse(String original){
        String reversedString= "";
        System.out.println("Question 1: Original String is : "+original);

        for(int i=original.length()-1 ; i >=0 ; i--){
            reversedString = reversedString + original.charAt(i);
        }

        System.out.println("Answer 1: Reversed String is : "+reversedString);
    }

    public void binarytodecimal(String binaryString){
        int calculatedDecimalValue;
        System.out.println("Question 2: Binary String is : "+binaryString);


    }


}
