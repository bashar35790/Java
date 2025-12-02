import java.util.Scanner;

public class ArmostongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num , r , sum = 0, temp;
        
        num = input.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
            
        }

        if(sum == num){
            System.out.println("The number is Armonstrong number");
        }else{
            System.out.println("The number is not a armostrong number: ");
        }
        
    }
}
