import java.util.*;
public class password_validation{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //length should be graterthan or equal to 4
        if(s.length() < 4){
            System.out.println(0);
            return;
        }
        //first character is alphabet
        if(!Character.isLetter(s.charAt(0))){
            System.out.println(0);
            return;
        }

        boolean digit = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
           //at least one digit should be in password
            if(Character.isDigit(ch)){
                digit = true;
            }
        }

        if (digit = true){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        return;


        
    }
}
