//Write a java program to convert string into integer and integer into string.

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String to Integer
        System.out.println("Enter the string: ");
        String str = s.nextLine();

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Converted Integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Integer to String
        System.out.println("Enter the Integer value: ");
        int intInput = s.nextInt();

        String strValue = Integer.toString(intInput);
        System.out.println("Converted String value: " + strValue);

        s.close();
    }
}
