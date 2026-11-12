public class mirrorImageTriangle {
    public static void main(String[] args) {
        int n = 4;
        int n2 = 3;
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= i - 1; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n2; i++) {
            for (int spaces = 1; spaces <= n2 - i; spaces++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1) + 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
