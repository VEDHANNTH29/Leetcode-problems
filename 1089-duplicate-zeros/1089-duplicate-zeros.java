class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans=arr.clone();
        int j=0;
        for(int i=0;i<ans.length && j<arr.length;i++){
            arr[j++]=ans[i];
            if(ans[i]==0 && j<arr.length){
                arr[j++]=0;
            }
        }
    }
    
}