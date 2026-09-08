// class Solution {
//     public int countCommas(int n) {
//         int cnt = 0;
//         while(n>0){
//             n = n/10;
//             cnt++;

//         }
//         int ans = cnt%3;
//         return (ans*3);
//     }
// }

class Solution {
    public int countCommas(int n) {
        return Math.max(0, n - 999);
    }
}