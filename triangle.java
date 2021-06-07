package Homework1;
import java.lang.*;
class Triangle {
    int a ;
    int b ;
    int c ;
    int s ;
    double perimeter;
    double area;


    public double perimeter() {
         perimeter = a + b+ c;
        return perimeter;
    }

    public double area(){
        s = (a+b+c)/2;
           area = (s* (s-a)*(s-b)*(s-c))^2;
            return area;
    }
}
public class triangle {
    public static void main (String [] args ){
        Triangle tr1 = new Triangle();
        tr1.a = 3;
        tr1.b = 4;
        tr1.c = 5;

        System.out.println( "The perimeter of this triangle is :  " + tr1.perimeter());
        System.out.println("The area of this triangle is :  " +  tr1.area());


    }
}
