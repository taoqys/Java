public class Variable {
    public static final float PI = 3.14159f;

    public static void main(String[] args) {
        int x = 1;
        float y = 2.0f;
        byte z = 12;
        System.out.println(x + y);
        String name = "你好";
        System.out.println(name);
        while (z <= 20) {
            System.out.println(z);
            z += 1;
        }
//        final double PI = 3.14;
//        double area;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the round:");
//        double r = scanner.nextDouble();
//        area = PI * r * r;
//        System.out.println(area);

//  datatype convert
        int a = 123;
        float b = 4.56f;
        String c = "789";
        String d = "234";

        String a_str = Integer.toString(a);
        String b_str = String.valueOf(b);
        int b_int = (int) b;
        int c_int = Integer.parseInt(c);
        int d_int = Integer.parseInt(d);
        System.out.println(a_str);
        System.out.println(b_str);
        System.out.println(c_int);
        System.out.println(d_int);
        String a_bin_str = Integer.toBinaryString(a);
        int a_bin_int = Integer.parseInt(Integer.toBinaryString(a));
        System.out.println(a_bin_str);
        System.out.println(a_bin_int);
        String a_hex = Integer.toHexString(a);
        System.out.println(a_hex);
        System.out.println(Integer.toString(Integer.parseInt(a_hex, 16), 10));
        System.out.println(b_int);

        int[] ns = new int[5];
        ns[0] = 60;
        ns[1] = 70;
        ns[2] = 80;
        ns[3] = 90;
        ns[4] = 100;
        System.out.println(ns.length);
        int[] ns2 = new int[] { 68, 79, 91, 85, 62 };
        String[] names = {"Mick", "Jack", "Sherry"};
    }
}
