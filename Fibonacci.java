import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pibonacci namuber: ");
        int first = 0, secound = 1, fibo;
        int fiboNumber = input.nextInt();

        System.out.print(first + " " + secound);

        for(int i = 3; i <= fiboNumber; i++ ){
            fibo = first + secound;
            System.out.print(" " + fibo);
            first = secound;
            secound = fibo;
        }
    }
}
