package companyTwo;

public class TeamLead implements Timesheets, FirePower{


    @Override
    public void fillOutTimesheets() {
        System.out.println("Team lead is filling out Timesheets");
    }


    @Override
    public void getFired() {
        System.out.println("You didn't do your job right, you are fired!!!");
    }
}
