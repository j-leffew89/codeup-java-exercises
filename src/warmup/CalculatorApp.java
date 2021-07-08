package warmup;

import java.util.Scanner;
import java.util.*;

public class CalculatorApp {

    public static void main(String[] args){

        float num1 = 0;
        float num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        num2 = sc.nextInt();
        System.out.println("What operation? ");
        operator = sc.next().charAt(0);


        switch (operator){
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
        }

        System.out.println("\nWould you like to continue calculating? (y/n)");



        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
