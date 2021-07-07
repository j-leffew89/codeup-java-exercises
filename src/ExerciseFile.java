import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseFile {


    //        MINI EXERCISE
    // TODO: create three unique usernames (user1, user2, user3).
    //  create a fourth user and set it equal to user input. (ask
    //  the user to enter a username). if the username has already
    //  been used by user1, user2, or user3, print "sorry this
    //  username already exists.

//    Scanner sc = new Scanner(System.in);
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


//        System.out.println(basketball("Spurs"));
//    }
//
//    public static String basketball(String teamName){
//        return teamName + " is the best team";
//    }
//    public static String count(String str){
//        System.out.println(.length());
//    }

//-----------------Method OverLoading-----------------------

//    public static void main(String[] args) {
////        greeting("Jesse", "Sosa");
//        age(100);
//        quote("To be, or not to be That is the question!");
//        greeting(3, 3);
//    }
//
//    public static void greeting() {
//        System.out.println("hello world");
//    }
//
//    public static void greeting(String oneGreeting) {
//        System.out.println(oneGreeting);
//    }
//
//    public static void greeting(int randomNum){
//        System.out.println(randomNum);
//    }
//    public static void greeting(char letter){
//        System.out.println(letter);
//    }
//
//    public static void greeting(int anotherNum, int andAnother){
//        System.out.println(anotherNum + " " + andAnother);
//    }

//    public static void greeting(String FirstName, String LastName){
//        System.out.println("Hello " + FirstName + " " + LastName);
//    }

//    public static void age(int oneAge){
//        System.out.println("That's crazy! You don't look " + oneAge + " years old!");
//    }
//
//    public static void quote(String Quote){
//        System.out.println("Yo This is my Fav Quote: " + Quote);
//
//------------------------------WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


//
//        System.out.println("What is your name, age and do you have any pets?");
//        String input1 = sc.next();
//        String input2 = sc.next();
//        String input3 = sc.next();
//
//        System.out.println(getTheFact(input1));
//    }
//
//    private static String getTheFact(String input1){
//        return input1;
//    }
//        System.out.println(" How many seats are there in the movie " + " theatre?");
//
//        int seatsLeft = sc.nextInt();
//        movieTheatre(seatsLeft);
//    }

//    public static void movieTheatre(int numSeats){
//        if(numSeats > 0) {
//            System.out.println("there are " + numSeats + " available");
//
//            numSeats--;
//            System.out.println("numSeats: " + numSeats);
//            movieTheatre(numSeats);
//        }
//    }

        //    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. create a method that takes in how
//     many miles that have left in training and simulate that they check in with you after every
//     2 miles. print out how many miles they have left in training until they have 0 miles left.

//        System.out.println("Okay, today i'm having you run 20miles");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write some stuff that has uppercase letters");
        String input = sc.nextLine();

        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < input.length(); i++) {

            if (Character.isUpperCase(input.charAt(i))) upperCase++;


            if (Character.isLowerCase(input.charAt(i))) lowerCase++;
        }

        System.out.println("There are: " + upperCase + " UpperCase Letters");
        System.out.println("There are: " + lowerCase + " LowerCase letters");



    }
}
