/*
3. (Medium difficulty) Make a program showing letters randomly, indicating whether
they are vowels or consonants. Tip: You can use the ASCII code. You can generate
integers and transform them to char with a explicit casting.
 */

package exercises;

public class Exercise3 {
    public static void main(String[] args) {

        int character = (int) (Math.random() * 58 + 65);

        while (character > 90 && character < 97) {
            character = (int) (Math.random() * 58 + 65);
        }

        if (character == 65 || character == 69 || character == 73 || character == 79 || character == 85 || character == 97 || character == 101 || character == 105 || character == 111 || character == 117) {
            System.out.println("VOWEL ---> " + (char) character);

        } else {
            System.out.println("CONSONANT ---> " + (char) character);
        }

    }
}
