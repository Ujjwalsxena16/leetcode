import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;

        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        if (k == 0)
            return nums;

        int w = 2 * k + 1;

        if (w > n)
            return arr;

        int l = 0;
        int r = 0;
        long sum = 0;   // changed int → long

        // First window
        while (r < w) {
            sum += nums[r];
            r++;
        }

        arr[k] = (int)(sum / w);

        // Sliding window
        while (r < n) {

            sum += nums[r];
            sum -= nums[l];

            l++;
            r++;

            arr[k + l] = (int)(sum / w);
        }

        return arr;
    }
}