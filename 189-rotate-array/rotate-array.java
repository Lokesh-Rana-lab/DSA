class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        List<Integer> list = new ArrayList<>();
        int b=nums.length-k;
    
        for(int i=b;i<nums.length;i++){
            list.add(nums[i]);
        }

         for(int i=0;i<b;i++){
            list.add(nums[i]);
        }

         for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }

        
        
    }
}