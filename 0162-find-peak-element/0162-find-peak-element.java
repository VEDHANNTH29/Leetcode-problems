class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        int left=0;
        int right=1;
        while(left<right && left<nums.length && right<nums.length){
            if(nums[left]<nums[right]){
                max=Math.max(max,right);
            }
            left++;
            right++;
        }
        return max;
    }
}