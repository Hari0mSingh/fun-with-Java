
//WAP to calculate the prime number from n1 to n2 and n1,n2 are entered through the keyboard.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = s.nextInt();
        System.out.print("Enter n2: ");
        int n2 = s.nextInt();
        s.close();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.println("Prime numbers between " + n1 + " and " + n2 + ":");
        
        for (int i = Math.max(n1, 2); i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime!");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
