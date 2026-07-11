class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left < right){
            int currentareas=(right-left) * Math.min(height[left],height[right]);
            if(currentareas>max){
                max=currentareas;
            }
            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;


    }
}