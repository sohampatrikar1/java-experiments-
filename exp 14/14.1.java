import java.util.ArrayList;
import java.util.Scanner;

public class Exp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Student Names: " + students);
        for (String name : students) {
            System.out.println(name);
        }

        students.add(2, "Neha");
        System.out.println("\nAfter adding Neha");
        System.out.println(students);

        students.remove("Amit");
        System.out.println("\nAfter removing Amit");
        System.out.println(students);

        System.out.println("\nEnter name to search");
        String name = sc.nextLine();

        if (students.contains(name)) {
            System.out.println(name + " is present in the list");
        } else {
            System.out.println(name + " is not present in the list");
        }

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}
