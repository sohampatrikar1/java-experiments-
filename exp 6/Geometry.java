class Geometry {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }
}

class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

class Student {
    private String name;
    private double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        if (marks.length == 0) return 0;
        return calculateTotal() / marks.length;
    }

    public char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return 'A';
        if (percentage >= 80) return 'B';
        if (percentage >= 70) return 'C';
        if (percentage >= 60) return 'D';
        if (percentage >= 50) return 'E';
        return 'F';
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Geometry ---");
        System.out.println("Circle Area (r=5): " + Geometry.circleArea(5));
        System.out.println("Rectangle Area (l=4, w=6): " + Geometry.rectangleArea(4, 6));

        System.out.println("\n--- Calculator ---");
        System.out.println("Addition (10 + 5): " + Calculator.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + Calculator.subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + Calculator.multiply(10, 5));
        System.out.println("Division (10 / 5): " + Calculator.divide(10, 5));

        System.out.println("\n--- Student ---");
        double[] marks = {85.5, 92.0, 78.5, 88.0, 95.0};
        Student student = new Student("Alice", marks);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Percentage: " + student.calculatePercentage() + "%");
        System.out.println("Grade: " + student.calculateGrade());
    }
}