// Last updated: 31/08/2026, 09:57:09
1class Solution {
2    public int reverseBits(int n) {
3        return rev(n,32);
4    }
5    private int rev(int v,int len){
6        if(len == 1)return v & 1;
7        int half = len >> 1;
8        int mask = (1 << half) - 1;
9        int lo = v & mask;
10        int hi = v >>> half;
11        return (rev(lo,half) << half) | rev(hi,half);
12    }
13}