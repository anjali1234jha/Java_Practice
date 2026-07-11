import java.util.*;
public class GCD{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         
        //initailize gcd
        int gcd = 1;

        for(int i=1; i <= Math.min(m,n); i++){
             
            //find common factor
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}