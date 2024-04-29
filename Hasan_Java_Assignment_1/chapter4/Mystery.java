package chapter4;

// 4.16 What does the following program print?

//  1  // Exercise 4.16: Mystery.java
//  2  public class Mystery {
//  3     public static void main(String[] args) {
//  4        int x = 1;
//  5        int total = 0;
//  6
//  7        while (x <= 10) {
//  8           int y = x * x;
//  9           System.out.println(y);
// 10           total += y;
// 11           ++x;
// 12       } 
// 13
// 14       System.out.printf("Total is %d%n", total);
// 15    } 
// 16  }

public class Mystery {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;

        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n", total);
    }
}

// Output 1 4 9 16 25 36 49 64 81 100
// Total is 385