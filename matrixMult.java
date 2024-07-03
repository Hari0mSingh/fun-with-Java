
//WAP to multiply two matrix of 3X3 and print the result matrix

import java.util.*;

public class matrixMult {
    public static void main(String args[]){
        int mat1 [][] = new int[3][3];
        int mat2 [][] = new int[3][3];
        int resultmat [][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the 1st metrix.");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("enter "+i+j+" index element");
                mat1[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements fo the 2st metrix.");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("enter "+i+j+" index element");
                mat2[i][j] = s.nextInt();
            }
        }
        //logic for multiplication
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    resultmat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        //printing the matrix
        System.out.println("result matrix!");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(resultmat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}