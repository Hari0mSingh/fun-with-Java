
//WAP to concatenate two strings by adding a space between them.One string is obtained from command line arguments and the other one from the keyboard.

import java.util.Scanner;

public class ConcateStrings{
    public static void main(String args[]){

    Scanner s = new Scanner(System.in);

    String str1 = args[0];
    System.out.println("Enter the String : ");
    String str2 = s.nextLine();

    String result = str1 + " " + str2;
    System.out.println("Concatenated String is : "+result);
    s.close();
}

}


// Running the program 

// javac ConcateStrings.java

// java ConcateStrings Hariom

// output: 

// Enter the String : 
// Singh
// Concatenated String is : Hariom Singh
