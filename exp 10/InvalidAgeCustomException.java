import java.util.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter age");
            int age = sc.nextInt();

            if (age < 0) {
                throw new MyException("Invalid age");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
