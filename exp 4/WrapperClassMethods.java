class WrapperClassMethods {
    public static void main(String[] args) {
        String s = "100";

        int a = Integer.parseInt(s);
        Integer obj = Integer.valueOf(s);
        String str = obj.toString();

        System.out.println("parseInt(): " + a);
        System.out.println("valueOf(): " + obj);
        System.out.println("toString(): " + str);
    }
}
