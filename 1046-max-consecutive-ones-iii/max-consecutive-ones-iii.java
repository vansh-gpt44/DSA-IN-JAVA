class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0,l=0,r=0,n=nums.length,zero=0;
        while(r<n){
            if(nums[r]==0){ 
            zero++;
            }
            if(zero>k){
                if(nums[l]==0){
                    zero--;   
                }
                l++;
            }
            if(zero<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;


//=======================Brute Force========================================
        // int maxlen=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int zeros=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             zeros++;
        //         }
        //         if(zeros<=k){
        //             int len=j-i+1;
        //             maxlen=Math.max(len,maxlen);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlen;
    }
}