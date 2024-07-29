package classroom.day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*(100-0)));
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)==arr.get(i-1)){
                arr.remove(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
