package exercises;

import java.util.Arrays;

public class ArrayStringPractice {

    public static void main(String[] args) {
        String[] stringArray = new String[32];
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        stringArray = seuss.split(" ");
        System.out.println(Arrays.toString(stringArray));

        stringArray = seuss.split("\\.");
        System.out.println(Arrays.toString(stringArray));
    }
}
