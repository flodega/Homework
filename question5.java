package Homework1;
import java.lang.*;
class Rectangle{
    public int  length;
    public int width;
    public int  Area;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }
    public int Area(){
        Area = length * width;
        return Area;

    }
    public void getMeasurements(){
        System.out.println("Length : " + length + " " + "Width:  " + width);
    }
}
public class question5 {
    public static void main (String [] args ){
        Rectangle rct1 = new Rectangle(4, 5);
        rct1.getMeasurements();
        System.out.println("The area of this rectangle is : " + rct1.Area() );
        Rectangle rct2 = new Rectangle(5, 8);
        rct2.getMeasurements();
        System.out.println("The area of this rectangle is : " + rct2.Area() );
    }
}
