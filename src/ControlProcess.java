import java.util.Scanner;

public class ControlProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Hello " + name + ",you are an adult. ");
        } else {
            System.out.println("Hello kid. ");
        }


        System.out.print("Please enter your score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.print("Invalid score! ");
        }
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Excellent! ");
                break;
            case 8:
            case 7:
                System.out.println("Good! ");
                break;
            case 6:
                System.out.println("Pass. ");
                break;
            default:
                System.out.println("Failed.");
                break;
        }
//        compute the sum of 1 to 50
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println(sum);
        int sum0 = 0;
        for (int num0 = 1; num0 <= 100; num0++) {
            sum0 += num0;
        }
        System.out.println(sum0);
    }
}
