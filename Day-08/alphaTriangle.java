public class alphaTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            char c = (char) (i + 'A' - 2);
            for (int k = 1; k <= i - 1; k++) {

                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }
}
