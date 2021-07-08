public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person Finky = new Person("Tiffanny");
        Person Diamond = new Person("Diamond");
        Person Josh = new Person("Josh");

        Person[] People = {Finky, Diamond, Josh};

        for (int i = 0; i < People.length; i++) {
            System.out.println(People[i].getName());
        }

    }
}
