//WAP to check weather a string is empty or not, length of the String, compare two strings, convert string into lowercase and uppercase


import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = s.nextLine();

        if (str1.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }

        System.out.println("Length of the string: " + str1.length());

        System.out.println("Enter the second string to compare:");
        String str2 = s.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Uppercase: " + str1.toUpperCase());

        s.close();
    }
}
