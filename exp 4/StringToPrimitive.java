class StringToPrimitive {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "20.5";
        String s3 = "true";

        int a = Integer.parseInt(s1);
        double b = Double.parseDouble(s2);
        boolean c = Boolean.parseBoolean(s3);

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Boolean: " + c);
    }
}
