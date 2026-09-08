class Solution {
    private int countDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public int countCommas(int n) {
        int numberOfDigits=0;
        int ansCount=0;
        numberOfDigits=countDigits(n);
        if(numberOfDigits<4)
           return 0;
        else{
            for(int i=1000;i<=n;i++){
                ansCount++;
            }
        }
        return ansCount;
    }
}