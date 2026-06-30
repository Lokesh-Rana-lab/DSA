class Solution {
    public boolean isHappy(int n) {
        // if(n==1 || n==7) return true;
        // else if(n<10) return false;
        // else{
        //     int sum=0;
        //     while(n>0){
        //         int temp=n%10;
        //         sum+= temp*temp;
        //         n=n/10;
        //     }
        //     return isHappy(sum);
        // }
          
          HashSet<Integer> set = new HashSet<>();
             while(n!=1){
                if(set.contains(n)){
                    return false;
                }
                set.add(n);
                n=squareSum(n);
             }
             return true;


    }
    private int squareSum(int n){
        int sum =0;
        while(n>0){
            int d = n%10;
            sum += d*d;
            n/=10;
        }
        return sum;
        //commited
    }
}