// class Solution {
//     public int reverse(int x) {
//     int res=0;
//     int sign=0;
//     if(x<0){
//         sign=1;
//         x=-x;
//     }
//         while(x>0){
//             int digit=x%10;
//             res=res*10+digit;
//             x=x/10;
//         }
//         if(sign==1){
//             res=-res;
//         }
//         return res;
        
//     }
// }

class Solution {
    public int reverse(int x) {

        int reverse = 0;

        while (x != 0) {

            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }
}