package ArrayandString;

/**
 * https://leetcode.com/problems/plus-one/
 */

public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int soDu = 1;

        int i = n - 1;
        while (i >= 0 && soDu > 0) {
            int temp = digits[i] + soDu;
            digits[i] = temp % 10;
            soDu = temp / 10;
            i--;
        }

        if (soDu == 0)
            return digits;

        int[] a = new int[n + 1];
        a[0] = soDu;
        for (int j = 0; j < n; j++) {
            a[j + 1] = digits[j];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = { 9, 9 };
        int[] b = plusOne(a);
    }
}
