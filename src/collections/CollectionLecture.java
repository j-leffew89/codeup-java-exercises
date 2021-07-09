package collections;

import java.util.ArrayList;

public class CollectionLecture {

    public static void main(String[] args){
        ArrayList<String> stringArr = new ArrayList<>();
        // Add first element
        stringArr.add("Casey");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());
        System.out.println("\n");
        // Add second element
        stringArr.add("Laura");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());
        System.out.println("\n");

        stringArr.add("Jordy");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        // Remove second element
//        stringArr.remove(1);
//        System.out.println(stringArr.hashCode());
        System.out.println("\n");

        ArrayList<String> stringArrCopy = stringArr;

        System.out.println("Array List Copy: ");
        System.out.println(stringArrCopy);
        System.out.println("Copied list hashcode: ");
        System.out.println(System.identityHashCode(stringArrCopy));
        System.out.println("\n");
    }
}
