import java.util.*;
public class ArmstrongNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         //store orignal number into temp
         int temp = n;
         int sum = 0;

        while (n>0){
            //find last digit
            int Digit = n % 10;

            sum = sum + Digit * Digit * Digit;
            n = n/10;

        }
         if(temp == sum){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("not Armstrong");
        }
    }
}