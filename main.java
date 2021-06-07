package Homework1;

class Student {
    public String name;
    public int roll_no;
    public String phoneNumber;
    public String address;



    public void print (){
        System.out.println(name + ":   " + roll_no + "   "  + phoneNumber + "   " + address);
    }
}

public class main {
    public static void main (String [] args ){
        Student std1 = new Student();
        std1.name = "John";
        std1.roll_no = 2;



        Student std2 = new Student();
        std2.name = "John";
        std2.roll_no = 2;
        std2.phoneNumber = "123-456-7890";
        std2.address = "1234 N Hollywood Boulevard";
        std2.print();



        Student std3 = new Student();
        std3.name = "Sam";
        std3.roll_no = 3;
        std3.phoneNumber = "098-765-4321";
        std3.address = "4567 S Bollywood Boulevard";
        std3.print();
    }
}
