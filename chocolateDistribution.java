import java.util.*;
public class chocolateDistribution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //number of chocolate
        int chocolate = sc.nextInt();

        // number of children
        int children = sc.nextInt();

        //remaining chocalate after equal Distribution
        System.out.println(chocolate % children);
    }
}