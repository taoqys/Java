import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length; i++) {
            for (int m = 0; m < ns.length - i - 1; m++) {
                if (ns[m] < ns[m + 1]) {
                    int tmp;
                    tmp = ns[m];
                    ns[m] = ns[m + 1];
                    ns[m + 1] = tmp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
        int[] ns1 = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        Arrays.sort(ns1);
        System.out.println(Arrays.toString(ns1));

        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        double average = 0;
        
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
