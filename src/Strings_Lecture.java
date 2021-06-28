import java.util.Locale;
import java.util.Scanner;

public class Strings_Lecture {

    public static void main(String[] args) {

        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".


//        Scanner sc = new Scanner(System.in);
////                System.out.println("What is your first Name");
//                String[] studentsArr =
//                        {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                                "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                                "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                                "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                                "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                                "Casey", "Dorian", "Tristan", "Jordy"};
//                int randomNum = (int) (Math.random() * 28);
//                String randomName = studentsArr[randomNum];
//                /* your code goes here */
//                System.out.println("What is your first name?");
//
//                String firstname = sc.next();
//
//                if (firstname.equals(randomName)) {
//                    System.out.printf("Woah you guessed: %s", firstname);
//                } else {
//                    System.out.printf("Way off my Friend %s", firstname);
//                }


        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
//        Scanner sc = new Scanner(System.in);
//
//        String colors = "Red Orange Blue Yellow Green Purple";
//        System.out.println("What is your favorite color?");
//
//        String input = sc.next();
//
//        if (colors.startsWith(input)) {
//            System.out.println("My Fave color: " + input + " , is the first one");
//        }else if (colors.endsWith(input)) {
//            System.out.println("My fave color: " + input + " is last");
//        }else {
//            System.out.println("I don't know that color");
//        }

//        String scuba = "self contained underwater breathing apparatus";
//        char letter = 'c';
//        System.out.println(scuba.indexOf('u'));
//        String word = "underwater";
//        System.out.println(scuba.lastIndexOf(word));

//-------------length()------------------
//        String superCali = "Supercalifragilisticexpialidocious";
//        System.out.println(superCali.length());
//
//-------------replace()------------------
//        String before = "giggles";
//        String after = before.replace('i', 'o');
//        System.out.println("You cant swim with : " + before + " but you can swim with: " + after);

//-----------substring()----------------
//        String danceArms = "Where are you supposed to put your arms when" + " you dance? It's like the universal " + "question.";
//
//        int indexArms = danceArms.indexOf("arms");
//        int indexQuestion = danceArms.indexOf('I');
////        String new

//-----------toLowerCase()--------------
//        String coders = "The distance between looking like a genius " + "and Looking like an idiot in " + "programming? It's one Character " + "wide.";
//        System.out.println(coders);
//        System.out.println(coders.toLowerCase();
    }
}
