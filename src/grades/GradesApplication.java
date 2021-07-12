package grades;

import util.Input;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student Jesse = new Student("Jesse");
        Jesse.addGrade(91);
        Jesse.addGrade(88);
        Jesse.addGrade(77);

        Student Michelle = new Student("Michelle");
        Michelle.addGrade(85);
        Michelle.addGrade(83);
        Michelle.addGrade(72);

        Student Aly = new Student("Aly");
        Aly.addGrade(81);
        Aly.addGrade(90);
        Aly.addGrade(88);

        Student Ian = new Student("Ian");
        Ian.addGrade(98);
        Ian.addGrade(90);
        Ian.addGrade(86);

        HashMap<String, Student> students = new HashMap<>();
        students.put("j-leffew89", Jesse);
        students.put("Michelle01", Michelle);
        students.put("Aly_02", Aly);
        students.put("Ian20", Ian);

        options(students);

    }

    public static void options(HashMap<String, Student> students) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome!");
        System.out.println("\nHere are the GitHub usernames of our students:\n");
        for (String userName : students.keySet()) {
            System.out.printf("|%s| ", userName);
        }

        System.out.println("What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all grades\n" +
                "2 - view specific student\n"
        );
    }


    public static void userChoice(Scanner scanner) {
        String choice = sc.next();
        if (choice.equalsIgnoreCase("0")) {
            return;
        }
        if (choice.equalsIgnoreCase("1")) {

        }
        if (choice.equalsIgnoreCase("2")) {
            displayStudent(chooseStudent());
        }
    }

    public static String chooseStudent() {

        System.out.println("What student would you like to see more information on?");
        System.out.println(">");
        String userInput = sc.next();
        for (String userName : students.keySet()) {
            if (userInput.equalsIgnoreCase(userName)) {
                return userName;
            }
        }
        System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
        return chooseStudent();
    }

    public static void displayStudent(String student) {
        Student thisStudent = students.get(student);
        System.out.printf("Name: %s \nGithub Username: %s \nCurrent Average: %.2f \nList Of Grades: %s\n",
                thisStudent.getName(), student, thisStudent.getGradeAverage(), thisStudent.getGrades());

    }


}
