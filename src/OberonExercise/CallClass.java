package OberonExercise;

public class CallClass {

    public static void main(String[] args) {

        Info info = new Info("Oberon", "Teach Coding", 23, 22);

        System.out.println(info.getCohortName());
        System.out.println(info.getPurpose());
        System.out.println(info.getNumberOfStudents());



    }
}
