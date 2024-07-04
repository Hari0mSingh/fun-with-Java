//WAP to create a class with a private variable and implement setter and getter methods{setMyvariable,getMyvariable} to set and get the valueof private myVariable

import java.util.Scanner;

public class getterAndsetter{
    private int age;
    void setMyvariable(int a){
        age = a;
    }

int getMyvariable(){
    return age;
}
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        getterAndsetter s1 = new getterAndsetter();
        s1.setMyvariable(num);
        System.out.println("Age is : "+s1.getMyvariable());
}

}