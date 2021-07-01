package oop.animals;

public class SomethingsFishy {

    public static void main(String[] args) {

//        MarineAnimal marineAnimal;
//        boolean printedAllMarineLife = false;

        var marineAnimal = new AquaMammal("Blue Whale");

        marineAnimal.setMaxTimeSubmerged(30);

        System.out.println(marineAnimal.getName());
        System.out.println("This Aqua Mammal as a submerged time of: "
                + marineAnimal.getMaxTimeSubmerged() + " minutes");


    }
}
