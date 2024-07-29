package classroom.day4.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*(100-0)));
        }
        Collections.sort(arr);
        for(int i=1;i<100;i++){
            if(arr.get(i)==arr.get(i-1)){
                System.out.println(arr.get(i));
            }
        }
    }
}
