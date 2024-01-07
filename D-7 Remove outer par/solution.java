class Solution {
    public String removeOuterParentheses(String s) {
        int beg = 0, end = 0;
        String temp = "";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            temp = temp + c;
            if (c == '(')
                beg++;
            if (c == ')')
                end++;
            if (beg == end) {
               
                temp = temp.substring(1, temp.length()-1);
                ans = ans + temp;
                temp = "";
               
            
            }
            

        }
        return ans;
    }
}