package warmup;

import java.util.Arrays;

public class DailyWarmUps {

    public static void main(String[] args) {

        String string = "Jesse Sean Jordy sam";

        sprintArr(string);
    }

    public static void sprintArr(String string){
        String[] name =  string.split(" ");

        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }

}
