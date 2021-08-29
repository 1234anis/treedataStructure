class Solution {
    public char findTheDifference(String s, String t) {
        String temp = s+t;
        int ans = 0;
        for(char ch : temp.toCharArray()){
            ans = ans^(int)ch;
        }
        return (char)ans;
    }
}
