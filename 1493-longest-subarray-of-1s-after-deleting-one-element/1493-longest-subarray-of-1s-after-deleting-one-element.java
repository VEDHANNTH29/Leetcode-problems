class Solution {
    public int longestSubarray(int[] nums) {
        int subLen=0;
        int zeroCnt=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCnt++;
            }
            while(zeroCnt>=2){
                if(nums[left]==0){
                    zeroCnt--;
                }
                left++;
            }
            subLen=Math.max(subLen,i-left);
        }
        return subLen;
    }
}