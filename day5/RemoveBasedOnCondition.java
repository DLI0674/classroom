package classroom.day5;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveBasedOnCondition {
    static TreeSet<Integer> threshold(TreeSet<Integer>s,int x){
        Iterator<Integer>a=s.iterator();
        while(a.hasNext()){
            if(a.next()<x){
                a.remove();
            }
        }
        return s;
    }
    public static void main(String[] args) {
        TreeSet<Integer>s=new TreeSet<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(threshold(s,3));

    }
}
