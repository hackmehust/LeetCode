/**
 * https://leetcode.com/problems/remove-element/
 */
public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}