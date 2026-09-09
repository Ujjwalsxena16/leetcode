class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int l = 0;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        for (int r = 0; r < nums.length; r++) {
             sum += nums[r];
            if (r - l + 1 > k) {
                sum -= nums[l];
                l++;
            }
            if (r - l + 1 == k) {
                max = Math.max(max,  sum / k);
            }
        }

        return max;
    }
}