import java.util.*;
public class checkSorting{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            
        }

        boolean sorted = true;
        for(int i = 1; i<n; i++){
            if(arr[i] < arr[i-1]){
                sorted = false;
            }
        }
        if(sorted == true){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}