class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m= t.length();

        int[]fq = new int[128];
        int dst=0;

        for(int i=0;i<m;i++){
            if(fq[t.charAt(i)]==0) dst++;
            fq[t.charAt(i)]++;
        }
        int i=0 , j=0,strt=-1,cmplt=0,mnlen =Integer.MAX_VALUE;
        while(j<n){
            fq[s.charAt(j)]--;
            if(fq[s.charAt(j)]==0) cmplt++;

            while(i<=j && cmplt ==dst){
                int len = j-i+1;
                if(len<mnlen){
                    mnlen=len;
                    strt=i;
                }
                fq[s.charAt(i)]++;
                if(fq[s.charAt(i)]==1) cmplt--;
                i++;
            }
            j++;
        }
        return strt==-1 ? "":s.substring(strt ,strt+mnlen);
        
    }
}