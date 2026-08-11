// Last updated: 11/08/2026, 16:06:11
import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }
        int index = 0;
        while (count0-- > 0) nums[index++] = 0;
        while (count1-- > 0) nums[index++] = 1;
        while (count2-- > 0) nums[index++] = 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements (only 0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        solution.sortColors(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
        sc.close();
    }
}
