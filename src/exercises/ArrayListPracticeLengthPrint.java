package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPracticeLengthPrint {
    public static void main (String[] args) {
//        Variable
        List<String> wordList = new ArrayList<>();
        int wordLength = 0;
        Scanner input = new Scanner(System.in);

/*
        wordList.add("Toast");
        wordList.add("Flamingo");
        wordList.add("Ornery");
        wordList.add("Stomp");
        wordList.add("Paper");
        wordList.add("Wiggle");
        wordList.add("Top");
*/
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String seussArray[] = seuss.split(" ");
        wordList = Arrays.asList(seussArray);

        /*
        for (String s : wordList) {
            System.out.println(s);
        }
        */

        System.out.println("Enter word length: ");
        wordLength = input.nextInt();
        for (String word : wordList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
