// Last updated: 11/08/2026, 16:06:04
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int z = m + n - 1;
        while (a >= 0 && b >= 0) {
            if (nums1[a] >= nums2[b]) {
                nums1[z] = nums1[a];
                a--;
            } else {
                nums1[z] = nums2[b];
                b--;
            }
            z--;
        }
        while (b >= 0) {
            nums1[z] = nums2[b];
            b--;
            z--;
        }
    }
}