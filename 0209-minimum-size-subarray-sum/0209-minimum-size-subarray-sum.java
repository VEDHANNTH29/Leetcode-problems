class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,end=0,window=0,minVal=Integer.MAX_VALUE;
        while(end<nums.length){
            window+=nums[end];
            while(window>=target){
                minVal=Math.min(minVal,end-start+1);
                window-=nums[start];
                start++;
            }
            end++;
        }
        return minVal==Integer.MAX_VALUE?0:minVal;
        
    }
}