package Homework1;
import java.lang.*;

class Triangle1 {
    public int a;
    public int b;
    public int c;
    public int s;
    public double perimeter;
    public double area;

    public Triangle1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }


    public double perimeter() {
        perimeter = a + b + c;
        return perimeter;
    }

    public double area() {
        s = (a + b + c) / 2;
        area = (s * (s - a) * (s - b) * (s - c)) ^ 2;
        return area;
    }
}

public class second_triangle {
        public static void main(String[] args) {
            Triangle1 tr1 = new Triangle1(3, 4, 5);

            System.out.println( "The perimeter of this triangle is :  " + tr1.perimeter());
            System.out.println("The area of this triangle is :  " +  tr1.area());
        }
    }
