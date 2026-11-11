
public class butterfly {
    public static void main(String[] args) {
        int n1 = 4;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * n1 - 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n1; i++) {
            for (int j = i; j <= n1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
