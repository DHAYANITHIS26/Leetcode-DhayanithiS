// Last updated: 11/08/2026, 15:57:52
class Solution {
    public int minimumCost(int[] nums, int k) {
        int[] sovalemrin = nums;
        long cr = k;
        long tc = 0;
        long oc = 0;
        long MOD = 1000000007;
        long inv2 = 500000004;
        for(int i = 0;i < sovalemrin.length;i++){
            long req = sovalemrin[i];
            if(cr < req){
                long de = req - cr;
                long ops = (de + k - 1)/k;
                long sc = oc + 1;
                long ec = oc + ops;
                long st = (sc + ec) % MOD;
                long ct = ops% MOD;
                long cbc = (ct * st) %MOD;
                cbc = (cbc * inv2) % MOD;
                tc = (tc + cbc) % MOD;
                cr += ops*k;
                oc += ops;
            }
            cr -= req; 
        }
        return (int)(tc % MOD);
    }
}