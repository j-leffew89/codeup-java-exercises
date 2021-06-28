import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseFile {

    public static void main(String[] args) {

        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

//        Scanner sc = new Scanner(System.in);
//
//        String user1 = "Grady";
//        String user2 = "Mitch";
//        String user3 = "Robert";
//
//        System.out.println("Please enter a username: ");
//
//        String user4 = sc.nextLine();
//
//        if (user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
//            System.out.println("Sorry this user name already exists");
//        }else{
//            System.out.println("This is now your username!");
//        }

//        char grade = 'C';
//
//        switch ( grade ){
//            case 'A' :
//                System.out.println("AMAZING!!");
//                break;
//            case 'B':
//                System.out.println("Great Job everyone!");
//                break;
//            case 'C':
//                System.out.println("Fair but study more");
//                break;
//            case 'D':
//                System.out.println("You can do better!");
//        }

        //TODO: refactor your code from the previous mini exercise into a switch statement

//        System.out.println("Please enter a username:");
//
//        Scanner Scanner = new Scanner(System.in);
//
//        String input = Scanner.next();
//
//        Scanner.close();
//
//        switch (input){
//            case "Grady":
////                System.out.println("Sorry that name is taken");
////                break;
//            case "Mitch" :
////                System.out.println("Again Taken");
////                break;
//            case "Robert":
////                System.out.println("Dude get it together! Pick another name");
////                break;
//                System.out.println("User Exists! Try again!");
//                break;
//            default:
//                System.out.println("Awesome username!");
//        }

//        for(int myNum = 0; myNum <= 20; myNum++){
//            System.out.println(myNum);
//
//            //TODO: using previous mini exercise, allow the user to input a new username
//            // several times until a unique username is entered.
//
//        }
//        System.out.println("hello world");
//
//        System.out.println(greeting("twenty-four"));
//
//        public static int greeting(String age){
//            System.out.println("age: " + age);
//            int indexOfR = age.indexOf('r');
//            return indexOfR;
//        }

        //    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.

//        TODO: create a new method that accepts the string created from the
    //first method and returns the number of characters in that string.


        System.out.println(basketball("Spurs"));
    }

    public static String basketball(String teamName){
        return teamName + " is the best team";
    }
}
