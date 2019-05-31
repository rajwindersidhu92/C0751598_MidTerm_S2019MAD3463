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

    public void binarytodecimal(String binaryString) {
        int calculatedDecimalValue = 0;
        int multiplefactor = 1;
        boolean flag = false;
        System.out.println("Input String is : " + binaryString);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0') {
                if (binaryString.charAt(i) != '1') {
                    System.out.println("Input String is not binary");
                    System.out.println("Output is: Null");
                    flag = true;
                }
            }
            if (flag == true) {
                break;
            }
        }

        if (flag == false) {
            System.out.println("its binary");
            for (int j = binaryString.length() - 1; j >= 0; j--) {
                calculatedDecimalValue += Character.getNumericValue(binaryString.charAt(j)) * multiplefactor;
                multiplefactor *= 2;
            }
            System.out.println("Output is : " + calculatedDecimalValue);
        }
    }


        public void nameInitial(String name){
            String initials= "";
            System.out.println("Question 3: Name is : "+ name);

            String[] partOfNames = name.split(" ");
            if (partOfNames.length == 3){
                for(int i= 0 ; i < partOfNames.length ; i++){
                    if( i<2){
                        initials += partOfNames[i].charAt(0)+". ";
                    }
                    if(i==2){
                        initials += partOfNames[i];
                    }
                }

                System.out.println("Answer 3: initials of name is :" + initials);

            }else{
                System.out.println("Answer 3 : null");
            }

////
////            System.out.println("Answer 1: Reversed String is : "+reversedString);
        }


    }

