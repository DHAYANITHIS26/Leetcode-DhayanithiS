// Last updated: 11/08/2026, 16:05:31
class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int m : nums){
            n ^= m;
        }
        return n;
    }
}