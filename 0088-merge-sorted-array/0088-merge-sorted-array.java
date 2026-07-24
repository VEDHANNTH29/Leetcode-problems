class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=m;
        for(int i=0;i<n;i++){
            nums1[t]=nums2[i];
            t++;
        }
        Arrays.sort(nums1);
    }
}