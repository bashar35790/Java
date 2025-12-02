import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Intiger Number: ");
        int number, fact=1;
        number = input.nextInt();

        for(int i = number; i>=1; i--){
            fact = fact * i;
        }

        System.out.println("Factorial is: " + fact);
    }
}
 