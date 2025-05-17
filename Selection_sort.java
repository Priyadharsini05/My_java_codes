public class Main{
    static void selection(int n, int[] nums)
    {
        int min;
        int temp;
        for(int i = 0; i < n; i++)
        {
             min = i;
            for(int j = 0; j < n; j++)
            {
                if(nums[j] > nums[min]) //for ascending order
                {
                    min = j;
                }
            temp = nums[i];
            nums[i] = nums[min]; 
            nums[min] = temp;
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {14, 3, 2, 13, 7, 4};
        selection(6, nums);
        for(int a:nums){
            System.out.println(a+" ");
        }
    }
}
