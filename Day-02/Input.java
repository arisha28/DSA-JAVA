import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int a = sc.nextInt();
        System.out.println("Enter num 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
