import java.util.*;

interface FY {
    int rollNo = 101;
    String name = "Soham";
}

interface SY {
    String result = "Pass";
}

class Student implements FY, SY {
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
