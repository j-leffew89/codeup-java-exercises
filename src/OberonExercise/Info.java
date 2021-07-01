package OberonExercise;

public class Info {


    private String cohortName;
    private String purpose;
    private int numberOfStudents;
    private int length;


    public Info(String cohortName, String purpose,
                int numberOfStudents, int length){
        this.cohortName = cohortName;
        this.purpose = purpose;
        this.numberOfStudents = numberOfStudents;
        this.length = length;
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
