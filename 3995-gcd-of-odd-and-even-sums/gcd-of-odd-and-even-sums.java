class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int count=0,i=1,sumodd=0,sumeven=0,num=0;
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
        i=0;
        count=0;
        if(sumodd<sumeven){
            count=sumodd;
        }
        else{
            count=sumeven;
        }
        for(i=2;i<count;i++){
            if(sumodd%i==0 && sumeven%i==0){
                num=i;
            }
        }
        return num;
    }
}