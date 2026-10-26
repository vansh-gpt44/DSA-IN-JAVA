class Solution {
    public int strStr(String h, String n) {
        if(!h.contains(n)){
            return -1;
        }
        int i=0;
        while(i<h.length()){
            if(h.charAt(i)==n.charAt(0)){
                int count=0;
                for(int j=0;j<n.length();j++){
                    if(h.charAt(i+j)==n.charAt(j)){
                        count++;
                    }
                }
                if(count==n.length()){
                    return i;
                }
            }
            i++;
        }
        return 0;  
    }
}