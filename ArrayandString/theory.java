package ArrayandString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class theory {

    public static void main(String[] args) {
        /*
         * List<Integer> v0 = new ArrayList<>(); comment: shift alt a v0.add(0);
         * v0.add(1); 
         * v0.add(2); 
         * v0.add(3); 
         * v0.add(4); 
         * System.out.println(v0.size());
         */
        List<Integer> v1;
        Integer[] a = { 0, 1, 2, 3, 4 };
        v1 = new ArrayList<>(Arrays.asList(a));

        List<Integer> v2 = v1;
        List<Integer> v3 = new ArrayList<>(v1);

        System.out.println("Kich thuoc mang v1: " + v1.size());
        System.out.println("Phan tu dau tien cua mang v1: " + v1.get(0));
        
        System.out.println("In mang v1 theo kieu fori");
        for(int i = 0; i < v1.size(); i++) {
            System.out.print(v1.get(i) + " ");
        }
        System.out.println();
        System.out.println("In mang v1 theo kieu forech");
        for(int item: v1) {
            System.out.print(item + " ");
        }

        System.out.println();
        v2.set(0, 5); // Vi tri 0 gia tri 5 (index 0, value: 5)
        System.out.println("Sau khi set phan tu dau tien: " + v1.get(0));

        v3.set(0, -1);
        System.out.println("Tuy nhien khi set v3 thi khong anh huong toi v1: " + v1.get(0));

        Collections.sort(v1); //sap xep List v1
        for(int item: v1) {
            System.out.println(item + " ");
        }
        
        System.out.println("__________________________");
        v1.add(-1);
        v1.add(1, 6);
        for(int item: v1) {
            System.out.println(item + " ");
        }

        System.out.println("__________________________");
        //Xoa phan tu
        v1.remove(v1.size()-1);
        for(int item: v1) {
            System.out.println(item + " ");
        }
    }

}
