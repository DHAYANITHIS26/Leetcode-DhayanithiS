// Last updated: 11/08/2026, 15:57:54
class Solution {
    public int minimumPushes(String word) {
        int d = word.length() / 8;
        int m = word.length() % 8;
        return 4 * d * (d + 1) + m * (d + 1);
    }
}