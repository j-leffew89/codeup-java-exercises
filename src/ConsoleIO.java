import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class ConsoleIO {

    public static void main(String[] args) {
//        System.out.println("My name is Jesse");
//        System.out.printf("Hey look! New line!\n");
//        System.out.printf("Maybe new line");

//        String name = "Jesse";
////        System.out.printf("My name is %s", name);
//
//        String mySentence = String.format("My name is %s", name);
//        System.out.println(mySentence);

        String name = "Jesse";
        int child = 1;
        String age = "32";

        String mySentence = String.format("My name is %s and I have %s child \nI am %s years old", name, child, age);
//
        System.out.println(mySentence);

        int currencyInPennies = 1000;
//
        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies / 100.00);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your full name?");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("You entered : %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your birthday?");
//        String month = sc.next();
//        String day = sc.next();
//        String year = sc.next();
//        System.out.printf("I was born in: %s\n", month);
//        System.out.printf("On the: %s\n", day);
//        System.out.printf("The year was: %s\n", year);

//        System.out.print("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);
//        while (sc.hasNext()){
//            String word = sc.next();
//
//            if (word.equals("break")){
//                break;
//            }
//            System.out.println(word);
//        }
    }
}
