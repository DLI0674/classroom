package classroom.day5;

import java.util.ArrayList;
import java.util.HashSet;

public class MultipleSetIntersection {
    public static void main(String[] args) {
        ArrayList<HashSet<Integer>>arr=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<5;i++){
            HashSet<Integer>s=new HashSet<Integer>();
            for(int j=0;j<100;j++){
                s.add((int)(Math.random()*(100)));
            }
            arr.add(s);
        }
        for(int i=0;i<arr.size();i++){
            arr.get(0).retainAll(arr.get(i));
        }
        System.out.println(arr.get(0));
    }
}
