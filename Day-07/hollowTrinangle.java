
public class hollowTrinangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("  ");
            }
            if (i == 1 || i == n) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int k = 1; k <= (2 * i - 1) - 2; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
