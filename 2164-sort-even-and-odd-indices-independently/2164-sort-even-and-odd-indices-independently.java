class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int oS=0,eS=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                eS++;
            }
            else
              oS++;
        }
        int[] odd=new int[oS];
        int[] even=new int[eS];
        int l=0,r=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[l]=nums[i];
                l++;
            }
            else{
                odd[r]=nums[i];
                r++;
            }
        }
        l=0;
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=even[l];
                l++;
            }
            else{
                nums[i]=odd[r-1];
                r--;
            }
        }
        
      return nums;  
        
    }
}