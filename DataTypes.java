
//write a java program to print the all data types{primitive} in java

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        int i = s.nextInt();
        System.out.println("Integer value is: " + i);

        System.out.println("Enter a floating point value: ");
        float f = s.nextFloat();
        System.out.println("Floating point value is: " + f);

        System.out.println("Enter a character value: ");
        char c = s.next().charAt(0);
        System.out.println("Character value is: " + c);

        System.out.println("Enter a string value: ");
        s.nextLine(); 
        String str = s.nextLine();
        System.out.println("String value is: " + str);

        System.out.println("Enter a boolean value: ");
        boolean b = s.nextBoolean();
        System.out.println("Boolean value is: " + b);

        System.out.println("Enter a double value: ");
        double d = s.nextDouble();
        System.out.println("Double value is: " + d);

        System.out.println("Enter a byte value: ");
        byte by = s.nextByte();
        System.out.println("Byte value is: " + by);

        System.out.println("Enter a short value: ");
        short sh = s.nextShort();
        System.out.println("Short value is: " + sh);

        System.out.println("Enter a long value: ");
        long l = s.nextLong();
        System.out.println("Long value is: " + l);

        s.close();
    }
}
