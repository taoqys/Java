public class Main {
    public static void main(String[] args) { //定义方法名为main
        int x = 10;
        float y = 3.14f;//在使用float类型时，要在数字末尾加上’f‘，否则应为double型
        double z = 3.14;
        System.out.println("Hello world!"); //方法内容
        System.out.println(x);
        x = 20;//对变量x再次进行赋值，因为x已经存在，所以不需要也不能定义’int‘
        System.out.println(x + y + z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

//    public static void amain(String[] args) {
//        String Age = System.in;
//        boolean tf = (isAdult(Age)) >= 18;
//        System.out.println(Age);
//    }
}


/*
数据类型：
整数
byte：-128 ~ 127
short: -32768 ~ 32767
int: -2147483648 ~ 2147483647
long: -9223372036854775808 ~ 9223372036854775807
浮点型
包括 float 和 double 两种
布尔型（Boolean）
值的类型只能为 true 或 false
定义变量时若加入final则变成了常量
常量赋值后不能再进行重新赋值，否则会出现编译错误
eg： final double a = x
*/
// "/*" 和 "*/" 中可以写多行注释