
//WAP to to calculate area of various shapes with the method name 'area' using Method overloading

// Area of rectangle = length*bredth
// Area of circle = 3.14*radius*radius

public class methodOverloading {
    void area(int l, int b){
        float area = l*b;
        System.out.println("area of rectangle is : "+area);
    }
    void area(float r){
        float area = 3.14f*r*r;
        System.out.println("Area of circle is : "+area);
    } 

    public static void main(String args[]){
        methodOverloading s1 = new methodOverloading();
        s1.area(5, 6);

        methodOverloading s2 = new methodOverloading();
        s2.area(6.8f);

    }
}
