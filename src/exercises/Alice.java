package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
//        VARIABLES
        String searchTerm;
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
            "'without pictures or conversation?'";
        String newFirstLine;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a search term:");
        searchTerm = input.nextLine();
        if (firstLine.toLowerCase().contains(searchTerm.toLowerCase())) {
            int indexStart = firstLine.toLowerCase().indexOf(searchTerm.toLowerCase());
            int indexEnd = indexStart + searchTerm.length();
            newFirstLine = firstLine.replaceAll(searchTerm,"");
//            newFirstLine = firstLine.substring(0,indexStart) + firstLine.substring(indexEnd);
            System.out.println("Term found at index " + indexStart +
                " and its length is " + searchTerm.length() + ".");
            System.out.println(newFirstLine);
        } else {
            System.out.println("Term not found.");
        };
    }
}
