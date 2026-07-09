class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[cnt]!=nums[i]){
                cnt++;
                nums[cnt]=nums[i];
            }
            else{
                continue;
            }
            
            
    }
    return cnt+1;
    
    }
       
}