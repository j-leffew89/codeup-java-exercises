package oop;

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // tell me about a person
        Person person = new Person("Jesse",32, "short", "USA");
//        person person = new person();
        person.setName("Jesse");
        System.out.println(person.getEntertainment("ride roller coasters"));

        Person person1 = new Person();
        person1.setName("Tj");
        System.out.println(person1.getEntertainment("camping this weekend"));
        System.out.println(person.getNationality());

    }

}
