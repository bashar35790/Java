import java.util.Scanner;

public class primeNumer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numer: ");
        int number = input.nextInt();
        int count = 0;

        for(int i = 2 ; i < number; i++){
            if(number%i == 0 ){
                 count++;
            }
        }

        if(count == 0 ){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not prime number");
        }
    }
}
