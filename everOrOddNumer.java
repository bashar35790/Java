import java.util.Scanner;

public class everOrOddNumer {
    public static void main(String[] args) {
        Scanner cheekingNumer = new Scanner(System.in);
        System.out.println("Enter yor Numer: ");
        int number = cheekingNumer.nextInt();
       
        if (number%2 == 0) {
            System.out.println("This is Evern numer");   
        }else{
            System.out.println("This is Odd numer");
        }
    }
}
