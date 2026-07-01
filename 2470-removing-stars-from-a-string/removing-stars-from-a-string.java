class Solution {
    public String removeStars(String s) {
        // Stack<Character> st= new Stack<>();
        //     if(!st.isEmpty()){
        //         st.push(s.charAt(0));
        //         }
        // for(int i =0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch=='*'){
        //         st.pop();
        //     }
        //     else{
        //         st.push(ch);
        //     }
            
        // }
        // StringBuilder ss= new StringBuilder();
        // while(!st.isEmpty()){
        //     ss.append(st.pop());
        // }
        // return ss.reverse().toString();

        Stack<Character> st = new Stack<>();
        // if(!st.isEmpty()){
        //     st.push(s.charAt(0));
        // }
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
            }
            StringBuilder ss = new StringBuilder();
            while(!st.isEmpty()){
                ss.append(st.pop());
            }
            return ss.reverse().toString();
        
    }
}