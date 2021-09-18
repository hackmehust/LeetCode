package Learn;

public class _27_Remove_Element {
   
    public static int removeElement(int[] a, int val) {
        int n = a.length;

        for (int i = 0; i < n; ) {
            if (a[i] == val) {
                //Xoa phan tu
                for (int j = i ; j <= (n-2); j++) {
                    a[j] = a[j+1];
                }
                n--;
            } else { //Sau khi xoa no xet tiep phan tu i vua moi thay doi. Neu k = val thi se tang i++ r chay vong for ngoai
                i++;
            }
        }
        return n;
    }
    
    public static int removeElement2(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=x) {
                a[k] = a[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(removeElement(a, 2));
        System.out.println("Done");
    }
}