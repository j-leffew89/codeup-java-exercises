package javaPrepTwo;

import java.util.Arrays;

public class Question {

    public static int[] ascending(int[] intArry){

        Arrays.sort(intArry);
        return intArry;

    }

    public static int countWords(String str){
        return str.split(" ").length;

    }

    public static int calculator(String op, int num1, int num2){
        switch (op){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void cardHidden(){
        

//        String input = "123456789";
//        String lastFourDigits = "";
//
//        if (input.length() > 4) {
//
//            lastFourDigits = input.substring(input.length() - 4);
//        } else {
//            lastFourDigits = input;
//        }
//        System.out.println(lastFourDigits);
    }

}
