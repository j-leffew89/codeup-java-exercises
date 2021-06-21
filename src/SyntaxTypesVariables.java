import com.sun.security.jgss.GSSUtil;

import java.util.Locale;

public class SyntaxTypesVariables {

    public static void main(String[] args) {

//        byte myFirstNumber = 127;
//        byte mySecondNumber = 1;
//        myFirstNumber += mySecondNumber;
//        System.out.println(myFirstNumber);

//        System.out.println((int)'H' + 'e' + 'l' + 'l' + 'o');....500

//        String myName = "Jesse";
//        System.out.println(myName.toLowerCase(Locale.ROOT));

        byte temperature = 75;
//        var isNiceDay = true;

        if ((temperature > 60) && (temperature < 80 )){
            System.out.println("What a nice day");
        }else{
            System.out.println("I don't like it");
        }
    }
}

