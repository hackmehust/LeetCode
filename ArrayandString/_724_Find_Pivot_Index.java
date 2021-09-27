package ArrayandString;

/**
 * 
 */

public class _724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        // find total sum of elements in nums
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // if pivot is at index 0; Đặt giá trị tại index = 0 rồi duyệt lại các index còn lại ở mảng dưới
        int leftSum = 0;
        int rightSum = sum - nums[0];
        if (leftSum == rightSum) {
            return 0;
        }

        // traverse through array, compare left and right sum as they change
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
