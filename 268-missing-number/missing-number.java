// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i){
//                 return i;

//             }

//         }return n;
        
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {

       int n = nums.length;
       int sum =0;
       int total_sum = n * (n+1) /2;
       for(int i : nums){
        sum+=i;
       }
       int diff = total_sum - sum;
       return diff;
}
}


