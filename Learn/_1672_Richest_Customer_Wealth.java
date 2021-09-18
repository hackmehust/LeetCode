package Learn;
public class _1672_Richest_Customer_Wealth {
    
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int max = 0;
        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            if (tinhTongHangI > max) {
                max = tinhTongHangI;
            }
        }
       
        return max;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {3,2,1}};
        int[][] b = new int[2][3];

        int soHang = a.length; //2
        int soCot = a[0].length; //3
        System.out.println("So hang: " + soHang);
        System.out.println("So cot: " + soCot);

        System.out.println(maximumWealth(a));
    }
}
