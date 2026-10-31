public class operators {
    public static void main(String[] args) {

        // Arithematic Operator
        int a = 10, b = 3;

        // Addition
        int sum = a + b;

        // Subtraction
        int diff = a - b;

        // Multiplication
        int mul = a * b;

        // Division
        int div = a / b;

        // Modulus
        int mod = a % b; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        // Unary Operator
        int c = 10;
        int d = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (c++));
        System.out.println("Preincrement : " + (++c));

        System.out.println("Postdecrement : " + (d--));
        System.out.println("Predecrement : " + (--d));

        // Assignment Operator
        // initial value
        int num = 10;
        System.out.println("Initial: " + num);

        // add 5 → num = num + 5
        num += 5;
        System.out.println("After +5: " + num);

        // multiply by 2 → num = num * 2
        num *= 2;
        System.out.println("After *2: " + num);

        // subtract 5 → num = num - 5
        num -= 5;
        System.out.println("After -5: " + num);

        // divide by 2 → num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);

        // remainder after dividing by 3 → num = num % 3
        num %= 3;
        System.out.println("After %3: " + num);

        // Relational Operator
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        // Logical Operator
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operator
        int e = 0b1100;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}
