package movies;

import util.Input;
import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        public static void home(Scanner sc){

        System.out.println("What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n"
        );

        Input userInput = new Input();
//        userInput.getInt(0, 5);
        Movie[] allMovies = MoviesArray.findAll();
//        System.out.println(Arrays.toString(allMovies));

        for (int i = 0; i < allMovies.length; i++) {
            System.out.println(allMovies[i].getCategory());
        }

//        switch (userInput.getInt(0, 5)){
//            case 0:
//                break;
//            case 1:
//                (allMovies);
//                break;
//            case 2:
//                (allMovies, "animated");
//                break;
//            case 3:
//                (allMovies, "drama");
//                break;
//            case 4:
//                (allMovies, "horror");
//                break;
//            case 5:
//                (allMovies, "sci-fi");
//                break;
//
//        }


    }

}
