import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//
//        }
//-----------------------------------------------------
//        int num = 0;
//        do {
//            System.out.println(num);
//            num +=2;
//        }while(num <= 100);
//-----------------------------------------------------
//        int num = 100;
//
//        do{
//            System.out.println(num);
//            num -=5;
//        }while (num >= -10);
//-----------------------------------------------------
//        long num = 2;
//
//        do {
//            System.out.println(num);
//            num *=num;
//        }while (num <= 1000000);
//
//-------------------REFACTORING------------------------
//        for(int i = 5; i <= 15; i += 1) {
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }
//--------------------------------------------------------

//        for (int i = 1; i <= 100; i++){
//            if (i % 15 == 0){
//                System.out.println("FIZZBUZZ");
//            }
//            else if (i % 5 == 0){
//                System.out.println("BUZZ");
//            }
//            else if (i % 3 == 0){
//                System.out.println("FIZZ");
//            }else{
//                System.out.println(i);
//            }
//
//        }
////-------------------------------------------------------------
//        while(true) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("What number would you like to go up to?");
//
//            int input = scanner.nextInt();
//
//            System.out.println("Here is your table!\n");
//            System.out.println("Number | square | cubed");
//            System.out.println("------ | ------ | ------");
//
//            for (int i = 1; i <= input; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//
//                System.out.println(i + "      | " + squared + "\t\t| " + cubed);
//            }
//
//            System.out.println("Would you like to continue?");
//            String prompt = scanner.next().toLowerCase();
//
//            if (prompt.equals("yes")) {
//                continue;
//            } else {
//                System.out.println("Come back and play again sometime!");
//            }break;
//        }
//--------------------------------------------------------

        while(true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number, 0-100 and get your grade");

            int grade = scanner.nextInt();

            if(grade >= 97){
                System.out.println("Your grade is an A+");
            }else if(grade >=93){
                System.out.println("Your grade is an A");
            }else if(grade >=90){
                System.out.println("Your grade is an A-");
            }else if(grade >= 87){
                System.out.println("Your grade is an B+");
            }else if(grade >= 83){
                System.out.println("Your grade is an B");
            }else if(grade >= 80){
                System.out.println("Your grade is an B-");
            }else if(grade >= 77){
                System.out.println("Your grade is an C+");
            }else if(grade >= 73){
                System.out.println("Your grade is an C");
            }else if(grade >= 70){
                System.out.println("Your grade is an C-");
            }else if(grade >= 67){
                System.out.println("Your grade is an D+");
            }else if(grade >= 63){
                System.out.println("Your grade is an D");
            }else if(grade >= 60){
                System.out.println("Your grade is an D-");
            }else {
                System.out.println("Your grade is an F, Do BETTER!");
            }

            System.out.println("Would you like to continue?");
            String prompt = scanner.next().toLowerCase();

            if (prompt.equals("yes")) {
                continue;
            } else {
                System.out.println("Come back and enter your number to get your grade!");
            }break;
        }
    }
}
