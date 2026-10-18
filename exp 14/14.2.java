import java.util.LinkedList;

public class Exp14 {
    public static void main(String[] args) {
        // Experiment 14: LinkedList

        LinkedList<String> students = new LinkedList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");
        students.add("Sneha");

        System.out.println("Original Linked List: " + students);

        students.addFirst("Neha");
        System.out.println("After adding first: " + students);

        students.addLast("Rohan");
        System.out.println("After adding last: " + students);

        students.remove("Amit");
        System.out.println("After removing Amit: " + students);

        if (students.contains("Priya")) {
            System.out.println("Priya is present in the list");
        } else {
            System.out.println("Priya is not present in the list");
        }

        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        System.out.println("Total students: " + students.size());

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
