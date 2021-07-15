package warmup;

import java.sql.SQLOutput;
import java.util.*;

public class DailyWarmUps {

    public static void main(String[] args) {

        String str = "Oberon is the best cohort ever!";

        randomNum(str);


//        Scanner sc = new Scanner(System.in);

//        if(age )

//        int myNum = Integer.parseInt("eighteen");

//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);
//----------------------------------------------------------------
//        String string = "Jesse Sean Jordy sam";
//
//        sprintArr(string);
//        System.out.println(myNum);
//        System.out.println(myArrList);

//----------------------------------------------------
//        canBank();

    }

//    public static void canBank(){
//        Scanner sc = new Scanner(System.in);
//
//        try{
//            System.out.println("Please enter your age and how much you can deposit");
//            int userAge = sc.nextInt();
//            int userBalance = sc.nextInt();
//            if(userAge >= 16 && userBalance >= 200){
//                System.out.println("Congrats you qualified! Here is your account info!");
//            }else{
//                System.out.println("Sorry, we can't do business!");
//                throw new NumberFormatException("NaN");
//            }
//        }catch (InputMismatchException ex) {
//            System.out.println("This is NaN");
//
//        }
//    }
//-----------------------------------------------------------

//    public static void sprintArr(String string){
//        String[] name =  string.split(" ");
//
//        for(int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//        }
//    }
//-------------------------------------------------------------

    public static void randomNum(String str){

        Random random = new Random();

        int upperLimit = 50;

        int rando = random.nextInt(upperLimit);

//        try{
//            System.out.println("Give me a number between 0-50!");
//
//        }catch

    }

}
