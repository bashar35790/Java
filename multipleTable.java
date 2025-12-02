import java.util.Scanner;

public class multipleTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your multification number: ");
        int number, multi = 1;
        number = input.nextInt();

        for(int i =1; i<=10; i++){
            System.err.println(number + "X" + i + "=" + number*i);
        }
    }
}
