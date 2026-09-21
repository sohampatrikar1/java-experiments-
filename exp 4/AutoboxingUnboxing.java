class AutoboxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;

        int b = obj;

        System.out.println("Autoboxing: " + obj);
        System.out.println("Unboxing: " + b);
    }
}
