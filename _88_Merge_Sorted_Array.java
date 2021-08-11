public class _88_Merge_Sorted_Array {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int x : nums2) {
            chenPhanTuVaoMang(x, nums1, m);
            m++;
        }
    }
    private static void chenPhanTuVaoMang(int x, int[] nums1, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if (nums1[k] > x) {
                timDuocK = true;

                for (int i = m-1; i >= k; i--) {
                    nums1[i+1] = nums1[i];
                }
                nums1[k] = x;
                break;
            }
        }
        if (timDuocK == false) {
            nums1[m] = x;
        } 
    }
    public static void main(String[] args) {
        int[] n1 = {2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {0, 3, 6};
        merge(n1, 4, n2, 3);
        System.out.println("DONE");
        
    }
}
