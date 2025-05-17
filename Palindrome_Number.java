class Solution {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(x>0){
            int r = x%10;
            rev = (rev*10) + r;
            x = x/10;          
        }
        return temp==rev?true:false;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
    
}
