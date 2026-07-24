class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=m;
        for(int i=0;i<n;i++){
            nums1[temp]=nums2[i];
            temp++;
        }
        Arrays.sort(nums1);
    }
}