
public class c3Nested {
    public static void main(String args[]) {
        int i = 10;

        // Outer if statement
        if (i < 15) {
            System.out.println("i is smaller than 15");

            // Nested if statement
            if (i == 10) {
                System.out.println("i is exactly 10");
            }
        }
    }
}
