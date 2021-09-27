package Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        /* List<Integer> v0 = new ArrayList<>();   comment: shift alt a
        v0.add(0);
        v0.add(1);
        v0.add(2);
        v0.add(3);
        v0.add(4);
        System.out.println(v0.size()); */
        List<Integer> v1;
        Integer[] a = {0,1,2,3,4};
        v1 = new ArrayList<>(Arrays.asList(a));
        
    }

}
