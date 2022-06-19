/*
 * https://leetcode.com/problems/binary-search/
 */

public class _704_Binary_Search {

    public static int search(int[] a, int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n-1;

        while(iLeft <= iRight) {
            int iMid = (iLeft+iRight)/2;
            if (key == a[iMid]) {
                return iMid;
            } else if (key > a[iMid]) {
                iLeft = iMid + 1;
            } else {
                iRight = iMid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
}
