class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum  =0;
        int digSum = 0;
        int n = nums.length;
        int i =0;
        while(i<n){
            eleSum += nums[i];
            int x = nums[i];
            while(x >0){
                int digit = x%10;
                digSum += digit;
                x = x/10;
            }
            i++;
        }
        return Math.abs(eleSum - digSum);
    }
}