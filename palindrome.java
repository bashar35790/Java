import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A number: ");
        int num , r , sum =0, temp;
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum*10 + r;
            temp = temp /10 ;

        }

         if(num ==  sum){
            System.out.println("Number is palindrome Number");
         }else{
            System.out.println("Numer is not a palindrome Number");
         }
    }
}
