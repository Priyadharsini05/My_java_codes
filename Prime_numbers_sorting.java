import java.util.*;
public class Main
{
    static boolean prime(int i)
    {
        int factor = 0;
        for(int a = 2; a < i; a++)
        {
            if(i % a == 0)
            {
                factor++;
            }
        }
        if(factor == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static void sorting(int n, int[] nums)
    {
        int min;
        int temp;
        for(int i = 0; i < n; i++)
        {
             min = i;
            for(int j = 0; j < n; j++)
            {
                if(nums[j] > nums[min])
                {
                    min = j;
                }
            temp = nums[i];
            nums[i] = nums[min]; 
            nums[min] = temp;
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers:");
        int n = sc.nextInt();
        int res;
        int j = 0;
        int c = 0;
        int[] arr = new int[n];
        int i = 2;
        while(true)
        {
            
            if(prime(i))
            {
                arr[j] = i;
                c++;
                j = j+1;
            }
            i++;
            if(c == n)
            {
                break;
            }
        }
       
        
        int len = arr.length;
        for(int k = 0; k < len/2; k++){
            System.out.print(arr[k]+" ");
        }
        for(int l = len-1; l >= len/2; l--){
            System.out.print(arr[l]+" ");
        }
    }
}
