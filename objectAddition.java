// WAP to add the value of variables i & j of two objects obj1 and obj2 respectively and store the addition of both variables in object obj3. All three objects are part of a same class and i & j are private variables.

import java.util.Scanner;

public class objectAddition{
    private int i;
    private int j;
    objectAddition(){
        this.i = 0;
        this.j = 0;
    }
    objectAddition(int i,int j){
        this.i = i;
        this.j = j;
    }
    public static objectAddition addobject(objectAddition obj1, objectAddition obj2){
        int resultI = obj1.i + obj2.i;
        int resultJ = obj1.j + obj2.j;
        return new objectAddition(resultI,resultJ);
    }

    public void print(){
        System.out.println("Value of  i : "+i);
        System.out.println("Value of j : "+j);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("value of i and j for obj1 ");
        int i1 = s.nextInt();
        int j1 = s.nextInt();
        objectAddition obj1 = new objectAddition(i1,j1);
        System.out.println("value of i and j for obj2");
        int i2 = s.nextInt();
        int j2 = s.nextInt();
        objectAddition obj2 = new objectAddition(i2, j2);

        //object 3
        objectAddition obj3 = objectAddition.addobject(obj1,obj2);

        System.out.println("values for obj3(result of addition): ");
        obj3.print();

        s.close();
    }


}