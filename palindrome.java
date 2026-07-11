import java.util.*;
public class palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //Enter the number
        int n = sc.nextInt();

        //store orignal number into temp
        int temp = n;
        //intialize the reversee number
        int rev = 0;

        //revrse the number
        while(n > 0){
            rev = rev * 10 + n %10;
            n = n/10;
        }
        //compare  original and reverse number
        if(temp == rev){
            System.out.print("palindrome");

        }
        else{
            System.out.print("not palindrome");
        }
    }
}