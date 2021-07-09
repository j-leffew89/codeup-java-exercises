package collections;

import java.util.ArrayList;
import java.util.HashMap;

import oop.Person;

public class CollectionLecture {

    public static void main(String[] args){

//        ArrayList<String> stringArr = new ArrayList<>(),
//                stringArrCopy = new ArrayList<>();
//
//        // Add first element
//        stringArr.add("Casey");
//        stringArrCopy.add("Casey");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//        System.out.println("\n");
//        // Add second element
//        stringArr.add("Laura");
//        stringArrCopy.add("Laura");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//        System.out.println("\n");
//
//        stringArr.add("Jordy");
//        stringArrCopy.add("Jordy");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//
//        // Remove second element
////        stringArr.remove(1);
////        System.out.println(stringArr.hashCode());
//        System.out.println("\n");
//
//
//        System.out.println("Array List Copy: ");
//        System.out.println(stringArrCopy);
//        System.out.println("Copied list hashcode: ");
//        System.out.println(System.identityHashCode(stringArrCopy));
//        System.out.println("\n");
//
//        System.out.println("The array list  are equal: " + stringArr.equals(stringArrCopy));

//        ArrayList<Person> peopleList = new ArrayList<>();

//        peopleList.add(new Person("Casey Edwards"));
//        peopleList.add(new Person("Laura Ruiz-Roehrs"));
//        peopleList.add(new Person("Jordy Muniz"));
//
//        for(Person person : peopleList){
//            System.out.println(peopleList.indexOf(person));
//            PersonUtils.printGreeting("Hello, I am: ", person.getFullName());
//        }

        HashMap<Integer, String> myHashMap = new HashMap<>();

        for (int i = 0; i < 11; i++) {

            myHashMap.put(i, "This is a value");

        }


        System.out.println(myHashMap.containsKey(12));

    }
}
