class Solution {
    public int firstStableIndex(int[] nums, int k) {
   for (int i = 0; i < nums.length; i++) {

            int max = nums[0];
            int min = nums[i];

            // max from 0 to i
            for (int j = 0; j <= i; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            // min from i to n-1
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                }
            }

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }
}