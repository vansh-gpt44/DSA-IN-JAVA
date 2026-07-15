class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int count=0;
        int i=1;
        int sumodd=0,sumeven=0;
        int num=0;
        int sum=0;
        while(count<n*2){
            if(i%2==0){
                sumeven+=i;
                count++;
            }
            else{
                sumodd+=i;
                count++;
            }
            i++;
        }
        if(sumodd<sumeven){
            num=sumodd;
        }
        else{
            num=sumeven;
        }
        for(int j=2;j<num;j++){
            if(sumodd%j==0 && sumeven%j==0){
                sum=j;
            }
        }
        return sum;
    }
}