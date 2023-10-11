/*
1. Transform the next "switch" code into a sequence of "if"

switch(valor){
   case 0: case 1: System.out.println("Hello");
   case 2: System.out.println("Nice to meet you");
                break;
   case 3: System.out.println("Bye");
                break;
   default: System.out.println("I don't know what to say");
}
 */

package exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write a value (0 - 3): ");
        int value = sc.nextInt();

        if (value == 0 || value == 1 || value == 2) {

            if (value == 0 || value == 1) {
                System.out.println("Hello");
            }

            System.out.println("Nice to meet you");

        } else if (value == 3) {
            System.out.println("Bye");

        } else {
            System.out.println("I don't know what to say");
        }
    }
}
