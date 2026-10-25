class Solution {
    public boolean validMountainArray(int[] nums) {
        int big=nums[0],x=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>big){
                big=nums[i];
                x=i;
            }
        }
        if(big==nums[0] || big==nums[nums.length-1]){
            return false;
        }
        int count=0;
        for(int i=0;i<x;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
        }
        for(int i=x;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        return count==nums.length-1;
        
    }
}