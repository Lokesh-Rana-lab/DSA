class Solution {
    public int findNumbers(int[] nums) {
        // int total=0;
        // for(int i =0;i<nums.length;i++){
        //     int val=nums[i];
        //      int cnt=0;
        //     while(val>0){
        //         val=val/10;
        //         cnt++;

        //     }
        //     if(cnt%2==0)
        //         total++;
                
        // }
        // return total;

          int total=0;

        for(int i=0;i<nums.length;i++){
            int val = nums[i];
          
            int cnt=0;
            while(val>0){
                int d = val%10;
                cnt++;
                val/=10;

            }
            if(cnt%2==0){
             total++;
            }
        }
        return total;
    }
}