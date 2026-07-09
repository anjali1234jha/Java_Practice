import java.util.*
public class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //length should be graterthan or equal to 4
        if(s.length < 4){
            System.out.println(0);
            return;
        }
        //first character is alphabet
        if(!character.isletter = (s.char(0))){
            System.out.println(0);
            return;
        }

        boolean digit = false;

        for(int i=0, i<s.length, i++){
            char ch = s.char(i);
           //at least one digit should be in password
            if(character.isdigit = ch){
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
