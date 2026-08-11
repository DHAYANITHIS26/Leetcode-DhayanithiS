// Last updated: 11/08/2026, 15:57:47
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long a = 0;
        int idx = nums.length-1;
        while (k > 0){
            
            if(mul > 1){
                a += (long)nums[idx] * mul;
            }else{
                a += nums[idx];
            }
            idx--;
            mul--;
            k--;
        }
        return a;
    }
}