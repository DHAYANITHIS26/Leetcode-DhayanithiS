// Last updated: 11/08/2026, 16:01:23
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n < k || k<=0 || nums == null) {
            throw new IllegalArgumentException("Invalid input or window size.");
        } 

        int sum = 0;
        for(int i =0; i<k;i++){
            sum += nums[i]; //calculating sum of 1st k elements
        }
        double maxavg = (sum*1.0)/k; //calculating the intial maximum average

        for(int r = k; r< n; r++){
            int l = r - k ; //finding the left element
            sum = sum + nums[r] - nums[l]; //adding the new element and removing the left element
            double avg = (sum*1.0)/k; //finding the current average
            maxavg = (double) Math.max(maxavg,avg); //updating the maximum average so far
        }
        return maxavg;
    }
}