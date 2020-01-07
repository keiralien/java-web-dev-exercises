package exercises;

import java.util.ArrayList;

public class ArrayListPracticeEvenSum {
    public static void main(String[] args) {

//        Variables
        ArrayList<Integer> numArray = new ArrayList<>();
        Integer sum = 0;

//        Used for input, if needed
//        for (String a : args) {
//            if (Integer.parseInt(a) % 2 == 0) {
//                sum += (Integer.parseInt(a));
//            }
//        }

//        Created arrayList
        numArray.add(32);
        numArray.add(28);
        numArray.add(45);
        numArray.add(23);
        numArray.add(3);
        numArray.add(5);
        numArray.add(2);
        numArray.add(9);
        numArray.add(20);
        numArray.add(13);

//        Used for manually generated array
        for(Integer num : numArray) {
            if ( (num % 2) == 0) {
                sum += num;
            }
        }
        System.out.println((sum));

    }
}
