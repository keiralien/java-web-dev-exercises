package exercises;

public class ArrayPracticeOddPrint {

    public static void main(String[] args) {
//        Integer Array
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for(int i : intArray) {
            if ( (i % 2) != 0) {
                System.out.println(i);
            }
        }

    }
}
