package classroom.day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*(100-0)));
        }
        System.out.println(arr);
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arr);
    }
}
