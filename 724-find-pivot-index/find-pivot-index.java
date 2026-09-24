class Solution {
    public int pivotIndex(int[] nums) {
    int[] result=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
         for(int j=0;j<nums.length;j++){
            if(result[nums.length-1]-result[j]==result[j]-nums[j]){
                return j;
            }
        }
        return -1;
    }
    }
