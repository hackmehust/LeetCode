import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * https://leetcode.com/problems/sort-an-array/
 */

public class MergeSort {
    
    public int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        /*
         * i cua result
         * i1 chi muc ban dau cua a1
         * i2 chi muc ban dau cua a2
         */
        int i = 0, i1 = 0, i2 = 0;
        while(i < n) {
            if (i1 < a1.length && i2 < a2.length) { //a1 & a2 != Roongx
                if (a1[i1] <= a2[i2]) { // a1 nho hon
                    result[i] = a1[i1];
                    i++; i1++;
                } else { // a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            } else { // a1 roongx || a2 roongx
                if (i1 < a1.length) { // a1 ok
                    result[i] = a1[i1];
                    i++; i1++;
                } else { // a2 ok
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public int[] mergeSort(int[] a, int L, int R) {
        // Truong hop dac biet, dieu kien dung
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        
        // Chia ra
        System.out.println("Chia: " + L + " - " + R);
        int k = (L + R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);
        
         // Tron vao: a2 va a1 la cac mang da duoc sap xep
        int[] result = merge(a1, a2);
        System.out.println("Ket qua Merge: " + Arrays.toString(result));
        return result;
    }
    
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    
    public static void main(String[] args) {
        MergeSort s = new MergeSort();

        int[] c = {38, 27, 43, 3, 9, 82, 10};

        System.out.println(Arrays.toString(s.sortArray(c)));
    }
}
