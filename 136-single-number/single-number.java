import java.util.*;
public class Solution {
    public int singleNumber(int[] nums) {
    //     int result = 0;
    //     for (int num : nums) {
    //         result ^= num;
    //     }
    //     return result;
    // }
    
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }

     for(int num:nums){
        if(map.get(num)==1){
            return num;
        }

     }
     return -1;
     
}
}