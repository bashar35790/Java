import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your digit: ");

        int digit = input.nextInt();
        int temp = digit;
        int sum = 0, r;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}
