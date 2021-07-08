package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {

    public static void main(String[] args) {

        String[] personOneNames = getNameArray();
        String[] personTwoNames = getNameArray();

        System.out.println(Arrays.equals(personOneNames, personTwoNames));
//        int[] intArray = new int[3];
//
//        for(int i = 0; i < intArray.length; i++){
//            intArray[i]= i + 1;
//        }
//
//        intArray[0] = 1;
//
//        System.out.println(Arrays.toString(intArray));
//---------------------------------------------------------------
//        System.out.println(Arrays.toString(getIntArray()));
    }

//    public static int[] getIntArray() {
//        return new int[]{1, 2, 3};
   // }

//    public static int[] getIntArray(int length) {
//        int[] intArray = new int[length];
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i * 2;
//        }
//        return intArray;
//    }


    public static String[] getNameArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your names, please?");
        return sc.nextLine().split(" ");

    }
}
