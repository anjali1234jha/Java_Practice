import java.util.*;
public class reverseNumber{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //Enter the number
        int n = sc.nextInt();

        // intialize reverse number
        int rev = 0;
        
        while (n > 0){
            //to reverse the number
            rev = rev * 10 + n % 10;
            //to remove last digit
            n = n/10;
           
        }
        System.out.println(rev);
        
    }
} 
