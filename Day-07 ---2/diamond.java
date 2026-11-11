
public class diamond {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 3;
        for (int i = 1; i <= n1; i++) {
            for (int spaces = 1; spaces <= n1 - i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n2; i++) {
            for (int spaces = 1; spaces <= i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n2 - (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
