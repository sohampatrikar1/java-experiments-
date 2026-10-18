@FunctionalInterface
interface MyInterface {
    void show();
}

@FunctionalInterface
interface MyInt {
    void show2(int a);
}

@FunctionalInterface
interface MyCode {
    void show2(int a, int b);
}

public class LambdaDemo {
    public static void main(String args[]) {
        MyInterface obj = () -> {
            System.out.println("No parameter is called");
        };
        obj.show();

        MyInt obj1 = (a) -> {
            System.out.println("One parameter is called");
        };
        obj1.show2(10);

        MyCode obj2 = (a, b) -> {
            System.out.println("Addition = " + (a + b));
        };
        obj2.show2(5, 3);
    }
}
