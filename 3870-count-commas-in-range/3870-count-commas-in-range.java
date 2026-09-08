class Solution {
    public int countCommas(int n) {
        int numberOfDigits=0;
        int ansCount=0;
        if(n<1000)
           return 0;
        else{
            for(int i=1000;i<=n;i++){
                ansCount++;
            }
        }
        return ansCount;
    }
}