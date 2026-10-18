import java.util.*;
import java.io.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class password {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = "MITWPU";
        try {
            System.out.println("Enter the password");
            String s = sc.nextLine();
            if (!s.equals(str)) {
                throw new MyException("Authentication failed!");
            }
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
