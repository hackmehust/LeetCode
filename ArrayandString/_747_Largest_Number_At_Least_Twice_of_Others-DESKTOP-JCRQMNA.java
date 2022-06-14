package ArrayandString;

/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 */

public class _747_Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int index = -1, largest = -1, secondLargest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                secondLargest = largest; //// Trước khi tìm ra 1 giá trị lớn hơn mới thì gán giá trị lớn cũ cho biến second
                largest = nums[i];
                index = i;
            } else if (secondLargest < nums[i]) {
                secondLargest = nums[i];
            }
        }
        return (largest >= secondLargest * 2) ? index : -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 0 };
        System.out.println(dominantIndex(nums));
    }
}
