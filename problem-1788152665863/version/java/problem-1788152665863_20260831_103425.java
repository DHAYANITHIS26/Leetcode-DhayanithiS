// Last updated: 31/08/2026, 10:34:25
1class Solution {
2    public int findComplement(int num) {
3        if(num == 0) return 1;
4        int bitLength = Integer.toBinaryString(num).length();
5        int mask = (1 << bitLength)-1;
6        return num ^ mask;
7    }
8}