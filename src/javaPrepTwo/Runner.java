package javaPrepTwo;

import java.util.Arrays;

public class Runner extends Question {
    public static void main(String[] args) {
        int [] ints = {10, 4, 8, 2};
        System.out.println(Arrays.toString(Question.ascending(ints)));

        String exStr = "This is an example string";
        System.out.println(Question.countWords(exStr));
    }
}
