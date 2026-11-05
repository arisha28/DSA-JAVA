public class yesterdayPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 8 - (i + (i - 1)); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}