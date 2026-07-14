class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat =0;
        int hi = people.length-1;
        int li = 0;
        while(li<=hi){
        if((people[hi]+people[li])<=limit){
         li++;
         hi--;
         boat++;
        }
        else{
            hi--;
            boat++;
            
        }
        }
        return boat;

    }
}