package CorrectTask;

/*
* https://leetcode.com/problems/move-zeroes/
    Dùng 2 chỉ số để duyệt mảng
*/

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curIndex++] = nums[i];
            }
        }
        for (; curIndex < nums.length; curIndex++) {
            nums[curIndex] = 0;
        }

        /**
        public void moveZeroes(int[] nums) {
            int i = 0;
            for (int num : nums) {   duyệt theo for each
                if (num != 0) {
                    nums[i++] = num;
                }
            }
            for (; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
         */
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
