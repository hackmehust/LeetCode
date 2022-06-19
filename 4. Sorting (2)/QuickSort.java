import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] a, int L, int R) {
       // Dieu kien dung
        if (L >= R) return;

        // B1. Chon khoa
        int key = a[(L+R)/2];

        // B2. Phan bo lai mang theo khoa
        int k = partition(a, L, R, key);

        // B3. Chia doi mang => Lap lai
        quickSort(a, L, k-1);
        quickSort(a, k, R);
    }

    // Return pivot value
    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while(iL <= iR) {
            //Voi iL, di tim phan tu >= key de doi cho
            while(a[iL] < key) iL++;
            //Voi iR, di tim phan tu < key de doi cho
            while(a[iR] > key) iR--;
            
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }
    public static void main(String[] args) {
        int[] a = {10, 80, 30, 90, 40, 50, 70};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
