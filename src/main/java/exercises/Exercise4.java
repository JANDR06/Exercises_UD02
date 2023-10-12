/*
4. (High difficulty) Given a text entered by the user, remove all the duplicated
words except double r and double l. Thus, "estoy  enn laa villa del  perroo"
should be transformed to "estoy en la villa del perro". Be careful with double
spaces too.
 */

package exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userString, finalString = "";

        System.out.print("Enter a text: ");
        userString = sc.nextLine();

        for (int i = 1; i < userString.length(); i++) {

            if (userString.charAt(i - 1) != userString.charAt(i) ||
                    userString.charAt(i - 1) == 114 && userString.charAt(i) == 114 ||
                    userString.charAt(i - 1) == 108 && userString.charAt(i) == 108 ) {

                finalString = finalString + "" + userString.charAt(i - 1);
            }
        }

        finalString = finalString + "" + userString.charAt(userString.length() - 1);

        System.out.println(finalString);

    }
}
