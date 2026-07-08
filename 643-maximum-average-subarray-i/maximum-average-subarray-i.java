class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg=Double.NEGATIVE_INFINITY;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            avg=Math.max((double)sum/k,avg);
        }
        return avg;
    }
}