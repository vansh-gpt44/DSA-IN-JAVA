class Solution {
    public int hIndex(int[] c) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<c.length;i++){
            l.add(c[i]);
        }
        Collections.sort(l);
        Collections.reverse(l);
        int h=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i)>h){
                h++;
            }
        }
        return h;
        
    }
}