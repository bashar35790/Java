import java.util.Scanner;

public class vowelAndConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char letter = input.next().charAt(0);

        // Convert to lowercase so it works for A, E, I, O, U also
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
