//find 2nd maximum number from an integer array

import java.util.Scanner;

public class Secondmaximum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i=0; i<10; i++){
            System.out.printf("Enter : "+i+"st index value of the array ");
            arr[i]=s.nextInt();
        }
        System.out.println("given array : ");
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }

        int max = Integer.MIN_VALUE;
        int Secondmax = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            if(arr[i]>max){
                Secondmax = max;
                max = arr[i];    
            }
            else if(arr[i]>Secondmax&&arr[i]>max){
                Secondmax = arr[i];
            }
        }
        System.out.println("Second maximum value of the array : "+Secondmax);
        s.close();
    }
}