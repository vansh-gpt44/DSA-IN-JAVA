class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(n==nums[j]){
                    nums[j]=-101;
                }
            }
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=-100){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }
}