// Last updated: 11/08/2026, 16:06:19
class Solution {
    public int mySqrt(int x) {
        // Use Math.sqrt but return as integer (floor value)
        return (int)Math.sqrt(x);
    }
}
public class Main {
    public static void main(String[] args) {
        int param_1 = 50;
        int ret = new Solution().mySqrt(param_1);
        System.out.println("Square root of " + param_1 + " is: " + ret);
    }
}
