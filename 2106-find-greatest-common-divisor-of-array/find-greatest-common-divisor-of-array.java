class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];                                                
            }
        }
        int sum=0;
        for(int i=2;i<=min;i++){
            if(min%i==0 && max%i==0){
                sum=i;
            }
        }
        if(sum==0){
            return 1;
        }
        return sum;
    }
}