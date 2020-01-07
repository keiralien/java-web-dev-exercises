package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentID;
        String studentName;

        System.out.println("Enter a student (or 0 to exit): ");

        do{
            System.out.println("Student ID: ");
            studentID = input.nextInt();

            if (studentID != 0) {
                System.out.println("Student Name: ");
                studentName = input.next();
                studentMap.put(studentID, studentName);

//                input.nextInt();
            }
        } while (studentID != 0);

        System.out.println("\nStudent List:");

        for (Map.Entry<Integer, String> student : studentMap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
