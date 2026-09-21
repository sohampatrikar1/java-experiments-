package student;

public class Student {
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