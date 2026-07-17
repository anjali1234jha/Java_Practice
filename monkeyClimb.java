import java.util.*;
public class monkeyClimb{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //height of pole
        int h = sc.nextInt();
        //climb
        int u = sc.nextInt();
        //slip
        int d = sc.nextInt();

        int height = 0;
        int days = 0;
        while (height < h){
            days++;
            height += u;

            if(height >= h){
                break;
            }
            height -= d;
        }
        System.out.println(days);
    }
}