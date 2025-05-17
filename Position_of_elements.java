import java.util.*;
public class Main{
    static void res(int target, int[] arr){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("The number "+target+ " is in "+i+" position" );
                return;
            }
            
        }System.out.println("The number is not available");
        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,12,45,32,4,-3,-2};
        int target;
        System.out.println("Enter a num to find its position:");
        target = sc.nextInt();
        res(target, arr);
        
    }
}
