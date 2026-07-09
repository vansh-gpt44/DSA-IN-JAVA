class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int minlen=n-1;
        maxsum=Math.max(maxsum,lsum);
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[minlen];
            minlen--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}