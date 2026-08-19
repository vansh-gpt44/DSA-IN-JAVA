class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int i=0;
        int l=x;
        while(l!=0){
            int temp=l%10;
            i=i*10+temp;
            l=l/10;
        }
        if(x==i){
            return true;
        }
        return false;
    }
}