// Last updated: 11/08/2026, 16:05:04
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0 ;
        for(int i=0 ; i<columnTitle.length();i++){
            char a = columnTitle.charAt(i);
            int value = a - 'A' + 1;
            ans = ans*26 + value ;
        }
        return ans;
    }
}