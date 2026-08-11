// Last updated: 11/08/2026, 16:07:38
class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if(s == null || s.isEmpty()){
            return 0;
        }

        int i = 0, sign = 1;

        if(s.charAt(i)=='+'){
            sign = 1; i++;
        }else if(s.charAt(i)=='-'){
            sign = -1;
            i++;
        }

        while(i<s.length() && s.charAt(i) == '0'){
            i++;
        }

        return helper(s,i,0L,sign);
    }

    private int helper(String s, int i, long res, int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return sign * (int)res;
        }

        res = res * 10 + s.charAt(i) - '0';

        if(sign * res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign * res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return helper(s,i+1,res,sign);

    }
}