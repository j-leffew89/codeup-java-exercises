package companyTwo;

public class Manager extends Employee{

    public static void main(String[] args){
        Manager Susy = new Manager();
        Susy.name = "Susy";
        Susy.department = "Marking";
        System.out.println(Susy.name + " works as a manager in the:" +
                " " + Susy.department + " department");

        Employee Bob;

        Bob = new Manager();
        Bob.name = "Bob";
        Bob.department = "Sales";
        System.out.println(Bob.name + " works as a manager in the:" +
                " " + Bob.department + " department");
    }

}
