// Last updated: 7/14/2026, 1:26:20 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int maxlen=0,l=0,r=0,n=nums.length,zero=0;
4        while(r<n){
5            if(nums[r]==0){ 
6            zero++;
7            }
8            while(zero>k){
9                if(nums[l]==0){
10                    zero--;   
11                }
12                l++;
13            }
14            if(zero<=k){
15                int len=r-l+1;
16                maxlen=Math.max(maxlen,len);
17            }
18            r++;
19        }
20        return maxlen;
21
22
23//=======================Brute Force========================================
24        // int maxlen=0;
25        // int n=nums.length;
26        // for(int i=0;i<n;i++){
27        //     int zeros=0;
28        //     for(int j=i;j<n;j++){
29        //         if(nums[j]==0){
30        //             zeros++;
31        //         }
32        //         if(zeros<=k){
33        //             int len=j-i+1;
34        //             maxlen=Math.max(len,maxlen);
35        //         }
36        //         else{
37        //             break;
38        //         }
39        //     }
40        // }
41        // return maxlen;
42    }
43}