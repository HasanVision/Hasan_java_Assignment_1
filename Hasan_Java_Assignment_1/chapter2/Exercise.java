package chapter2;
// 2.10

// Assuming that x = 2 and y = 3, what does each of the following statements display?

// System.out.printf("x = %d%n", x);

// System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));

// System.out.printf("x =");

// System.out.printf("%d = %d%n", (x + y), (y + x));

public class Exercise {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x));
    }
}
// output:

// x = 2
// Value of 2 + 2 is 4
// x =5 = 5