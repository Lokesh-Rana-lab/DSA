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
        int expected = n * (n + 1) / 2;  // find the total sum up to n,

        int actual = 0;
        for (int num : nums) {   // sum of arr
            actual += num;
        }

        return expected - actual;   // let 3 , 0 ,1  sum = 4
                                    // using sum formula n = 3 , 3*4/2 = 6 , and 6-4=2 ans
    }
}



