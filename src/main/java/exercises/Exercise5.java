/*
5. (High difficulty) Make a program that draws a square matrix from a value
entered by the user. For example:

Introduce a number:

5
01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */

package exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        int number = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
