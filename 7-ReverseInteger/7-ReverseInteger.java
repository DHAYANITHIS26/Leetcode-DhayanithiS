// Last updated: 11/08/2026, 16:07:40
class Solution {
    public int reverse(int x) {
        int a = 0;
        for(; x != 0;x /= 10){
            if(a < Integer.MIN_VALUE / 10||a> Integer.MAX_VALUE/ 10){
                return 0;
            }
            a = a*10 + x % 10;
        }
        return a;
    }
}