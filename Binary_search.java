import java.util.*;
public class Main
{
    static int binary(int left, int right, int n, int[] nums){
        int middle = left+(right - left)/2;
        if(left <= right){
        if(nums[middle] == n){
            return middle;
        }
        else if(n < nums[middle]){
            return binary(0, middle - 1, n, nums);
        }
        else{
            return binary(middle + 1, right, n, nums);
        }
        }
        return 200;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] nums = {2,3,4,5,22,33,44,55,66,77,88};
		System.out.println("Enter any number to find its index: ");
		int n = sc.nextInt();
		int res = binary(0, 10, n, nums);
		if(res != 200)
		{
		    System.out.println("Element found in "+res);
		}
		else{
		    System.out.println("Element not found");
		}
	}
}
