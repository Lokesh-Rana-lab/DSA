class Solution {
    public int majorityElement(int[] nums) {
    //    Arrays.sort(nums);
    //    for(int i=0;i<nums.length;i++){
    //     int cnt=1;
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j])
    //         cnt++;
    //     }
    //     if(cnt>nums.length/2){
    //     return nums[i];
    //    }
      
    //    }return -1;

    int candidate = nums[0];
    int vote = 1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==candidate){
        vote++;

        }
        else if(vote==0){
           candidate=nums[i];
           vote=1;
        }
        else {
            vote--;
        }
    }
    return candidate;

    }
}