public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        Integer i1 = 100;
        String s5 = "100";
        String s6 = i1.toString().intern();

        System.out.println(s6.equals(s5)); // true
        System.out.println(s5 == s6 ); // false


    }
}
