class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i<n+10;i++){
            int c = i;
            int prod = 1;
            while(c>0){
                int digit = c%10;
                prod = prod*digit;
                c = c/10;
            }
            if(prod % t == 0){
                return i;
            }


        }
        return -1;

    }
}