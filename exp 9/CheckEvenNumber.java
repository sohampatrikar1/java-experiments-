import java.util.*;

class CheckEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num = sc.nextInt();

        try {
            if (num % 2 == 0) {
                throw new Exception("Number is even");
            }
            System.out.println("Number is odd");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
