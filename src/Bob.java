import java.util.Scanner;
public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Say something to bob...");

        while(true) {

            String chat = scanner.nextLine();

            if(chat.contains("?")){
                System.out.println("Bob: Sure");
            } else if (chat.contains("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if(chat.isEmpty()){
                System.out.println("Bob: Fine. Be that way!");
            }else{
                System.out.println("Bob: Whatever...");
            }break;
        }
    }
}

//
//do {
//        System.out.println("Say something to bob:");
//        String userInput = bobScanner.next();
//        boolean askQuestion = userInput.endsWith("?");
//        boolean ifYelled = userInput.endsWith("!");
//        boolean isEmpty = userInput.equals("");
//        boolean endLoop = userInput.equalsIgnoreCase("end loop");
//        //Using Switch Statement
//        switch (userInput){
//        case userInput.endsWith("?"):
//        System.out.println("Sure");
//        break;
//        case ifYelled:
//        System.out.println("Woah, chill out man");
//        break;
//        case isEmpty:
//        System.out.println("Fine, be that way");
//        break;
//        case endConvo:
//        System.out.println("Ending Convo");
//        endLoop = true;
//        break;
//default:
//        System.out.println("Whatever..");
//        break;
//        }
//        } while (!endConvo);