import java.util.Scanner;

public class ReverseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, r, sum = 0, temp;
        System.out.print("Enter any Number: ");
        number = input.nextInt();
        temp = number;
        while (temp !=0) {
            r = temp%10;
            sum = sum *10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse = " +  sum);
    }
}
