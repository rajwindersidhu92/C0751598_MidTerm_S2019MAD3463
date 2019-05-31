package com.lambton;

public class C0751598 {
    public static void main(String[] args){
        String original = "Lambton";
        String binaryString1 ="111111";
        String binaryString2 ="111136";
        String name1 = "James tiBeriUs kiRK";
        String name2 = "AaroN LANGille";



        LambtonStringTools s1 = new LambtonStringTools();
        s1.reverse(original);

        System.out.println("Question 2 if the string is binary");
        s1.binarytodecimal(binaryString1);

        System.out.println("Question 2 if the string is not binary");
        s1.binarytodecimal(binaryString2);

        System.out.println("question 3 if name has firstname middle name and lastname");
        s1.nameInitial(name1);

        System.out.println("question 3 if name has only 2 names");
        s1.nameInitial(name2);


    }
}
