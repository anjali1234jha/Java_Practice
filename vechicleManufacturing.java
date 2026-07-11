import java.util.*;
public class vechicleManufacturing{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //total number of vechicles...
        int v = sc.nextInt();
        //total nuber of wheels...
        int w = sc.nextInt();

        if(w < (2*v) || w % 2 !=0 ||w > 4*v){
            System.out.println("invalid");
            return;
        }
        // number of four wheeler...
        int four = (w - (2*v))/2;
        //number of two wheeler...
        int two = v - four;

        System.out.println(two+ " "+four);
    }
}