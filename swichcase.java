import java.util.Scanner;

public class swichcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eter a character: ");
        char letter = input.next().charAt(0);
        letter = Character.toLowerCase(letter);

        switch (letter) {

          case 'a':
          case 'e':
          case 'i':
            case 'o':
                case 'u':

              System.out.println(letter + " is a vowel");
                break;

               default:
                System.out.print(letter + "this not nowel");


    }
}
}
