package chapter5;

// 5.27 What does the following program segment do?

//  1   for (i = 1; i <= 5; i++) {
//  2      for (j = 1; j <= 3; j++) {
//  3         for (k = 1; k <= 4; k++) {
//  4            System.out.print('*');
//  5         }
//  6
//  7          System.out.println();
//  8      }
//  9
// 10      System.out.println();
// 11   }

public class Do {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print('*');
                }

                System.out.println();
            }

            System.out.println();
        }
    }

}
// Output
// it will print a pattern of asterisks with 5 layers, each layer containing 3
// rows of 4 asterisks each,
// separated by empty lines