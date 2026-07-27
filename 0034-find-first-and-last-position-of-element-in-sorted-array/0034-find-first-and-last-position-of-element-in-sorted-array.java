class Solution {
     private int findFirst(int[] nums, int target){
         int low=0,high=nums.length-1;
         int index=-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
               high=mid-1;
         }
         return index;
    }
      private int findLast(int[] nums, int target){
        int low=0,high=nums.length-1;
          int index=-1;
          while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else
               high=mid-1;
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);
        return ans;
    }
}