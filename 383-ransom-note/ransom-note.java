class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] count = new int[26]; // for letters a-z

        // // Count letters in magazine
        // for (char c : magazine.toCharArray()) {
        //     count[c - 'a']++;
        // }

        // // Check ransomNote
        // for (char c : ransomNote.toCharArray()) {
        //     if (count[c - 'a'] == 0) {
        //         return false;
        //     }
        //     count[c - 'a']--;
        // }

        // return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        for(char ch:ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
