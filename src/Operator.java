public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num2 / num1 = " + (num2 / num1));
        System.out.println("num2 % num1 = " + (num2 % num1));
        System.out.println("num3 % num1 = " + (num3 % num1));
        System.out.println("num1++   = " + (num1++));
        System.out.println("num1--   = " + (num1--));
        // 查看 ++ 在操作数前后位置时结果的不同
        System.out.println("num4++   = " + (num4++));
        System.out.println("++num4   = " + (++num4));
        int a = 5;
        int b = 3;
        System.out.println("5/3 = " + (a / b));
        System.out.println(num1 == num2);
        System.out.println(num3 != num4);
        System.out.println(num2 <= num3);
        boolean positive = true;
        boolean negative = false;
        System.out.println(positive && negative);
        System.out.println(!positive);
        System.out.println(positive || negative);

//        条件运算符
//        variable x = (expression) ? value if true : value if false
        int result = num1 > num2 ? num1 : num2;
        System.out.println("The max between num1 and num2 is " + result);
    }
}
