import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(add(5,3));
        System.out.println(subtract(21,9));
        System.out.println(multiply(8,8));
        System.out.println(divide(14,2));
        System.out.println(modulus(4,18));
        getInteger(30,60);

    }
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
//
//        int sum = 0;
//
//        for(int i = 1; i <= num1; i++) {
//
//            sum = sum + num2;
//        }
    }
    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        do {
            System.out.printf("Enter number between %s and %s", min, max);
            int userInput = scanner.nextInt();
            if (userInput > min && userInput < max){
                System.out.println("In Range");
            }else{
                System.out.println("NOT in Range");
                break;
            }
            System.out.println("Do you want to continue (y/n)");
            userChoice = scanner.next();
        }while(!userChoice.equalsIgnoreCase("n"));

        return 1;
    }

    public static long getFactorial(int num) {
        if (num >= 1)
            return num * getFactorial(num - 1);
        else
            return 1;
    }

}
