import java.util.*;
public class primeNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         //suppose n is prime
         boolean isPrime = true;

         if(n <= 1){
            isPrime = false;
         }
         else{
             for(int i = 2; i <= Math.sqrt(n); i++){

                if(n % i == 0){
                    isPrime = false;
                    break;
                }
             }
         }
         if(isPrime){
            System.out.print("prime");
         }
         else{
            System.out.print("not prime");

         }
    }
}
