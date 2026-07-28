
import java.util.Scanner;
public class evenoddaddition {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Addition = " + sum);

        if (a % 2 == 0)
            System.out.println(a + " is Even");
        else
            System.out.println(a + " is Odd");

        if (b % 2 == 0)
            System.out.println(b + " is Even");
        else
            System.out.println(b + " is Odd");

        sc.close();
    }
}

