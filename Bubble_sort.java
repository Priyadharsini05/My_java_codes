public class Main{
    static void bubble(int n, int[] nums){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(nums[j + 1] < nums[j] ){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp; 
                }
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {14, 3, 2, 13, 7, 4};
        bubble(6, nums);
        for(int a:nums){
            System.out.println(a+" ");
        }
    }
}
