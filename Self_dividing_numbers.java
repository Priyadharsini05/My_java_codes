class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(isSelfDividing(i)){
                result.add(i);
            }
        }
        return result;
        
    }
    private boolean isSelfDividing(int i){
        int temp = i;
        while(i >0){
            int digit = i%10;

            if(digit == 0 || temp % digit != 0){
                return false;
            }
            i /= 10;
        }
        return true;
    }
}
