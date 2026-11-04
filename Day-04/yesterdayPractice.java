public class yesterdayPractice {
    public static void main(String[] args) {
        // Patter - 1 Rectangle
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // Pattern - 2 Triangle
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // Pattern -3 Slanted Rectangle
        // for (int i = 1; i <= 5; i++) {
        // for (int space = i - 5; space <= 5; space++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // Pattern - 4 ulta Triangle
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // Pattern - 5 Pyramid
        for (int i = 1; i <= 5; i++) {
            for (int space = i - 5; space <= 0; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
