import java.util.Scanner;

public class assignmentOparetor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter numer 1: ");
        num1 = userInput.nextInt();
        System.out.println("Enter numer 1: ");
        num2 = userInput.nextInt();

        //addition oparation
        result = num1 + num2;
        System.out.println("Addition is: " + result);

        //subtraction oparation
        result = num1 - num2;
        System.out.println("subtraction is: " + result);

        //divission oparation
        result = num1 / num2;
        System.out.println("divission is: " + result);

        //multiple oparation
        result = num1 * num2;
        System.out.println("multiple is: " + result);

        //modulas oparation
        result = num1 % num2;
        System.out.println("modulas is: " + result);

    }
}



