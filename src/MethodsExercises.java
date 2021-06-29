import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

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
            System.out.printf("Enter number between %d-%d", min, max);
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
}
