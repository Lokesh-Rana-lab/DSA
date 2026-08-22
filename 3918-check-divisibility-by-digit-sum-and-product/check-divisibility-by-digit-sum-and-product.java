class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int m = n;
        while(m>0){
            int d = m%10;
            sum += d;
            prod *= d;
            m = m/10;
        }
        if(n % (sum+prod)==0) return true;
        return false;
        
    }
}