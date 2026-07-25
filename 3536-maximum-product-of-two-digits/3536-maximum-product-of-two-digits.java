class Solution {
    public int maxProduct(int n) {
        int max=0,count=0,t=n;
        while(n!=0){
            count++;
            n/=10;
        }
        int[] num=new int[count];
        int i=0;
        while(t!=0){
            int digit=t%10;
            num[i]=digit;
            t/=10;
            i++;
        }
        for(int j=0;j<num.length;j++){
            for(int k=j+1;k<num.length;k++){
                int prdt=num[j]*num[k];
                max=Math.max(max,prdt);
            }
        }
        return max;
    }
}