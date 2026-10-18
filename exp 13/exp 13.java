import java.util.function.*;

public class Exp12 {
    public static void main(String[] args) {
        Predicate<Integer> isNotZero = (value) -> value != 0;
        System.out.println("Predicate FI (value is not 0): " + isNotZero.test(7));

        Consumer<String> print = (value) -> System.out.println("Consumer printed: " + value);
        print.accept("Hello world");

        Supplier<Double> getRandom = () -> Math.random();
        System.out.println("Supplier random value: " + getRandom.get());

        Function<Integer, Integer> square = (value) -> value * value;
        System.out.println("Function Result (Square): " + square.apply(5));
    }
}