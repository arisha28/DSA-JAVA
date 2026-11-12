import java.util.Scanner;

public class method {
    static void printwelcomMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = sc.next();
        System.out.println("Welcome" + " " + a);
    }

    static int add(int a, int b) {
        int sum = (a + b);
        return sum;
    }

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        printwelcomMessage();
        int result = add(2, 1);
        System.out.println("result" + " " + result);
        boolean b = isEven(result);
        System.out.println(b);
    }
}
