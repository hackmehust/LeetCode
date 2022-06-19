import java.util.Arrays;

public class _283_Move_Zeroes {

    public static int[] C1(int[] nums) {
        int n = nums.length;
        int[] T = new int[n];
        int iT = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                T[iT++] = nums[i];
            }
        }
        return T;
    }

    public static int[] C2(int[] a) {
        int n = a.length;
        int curIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[curIndex++] = a[i];
            }
        }

        while (curIndex < n) {
            a[curIndex++] = 0;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(C2(nums)));
    }
}
