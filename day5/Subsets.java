package classroom.day5;

import java.util.TreeSet;

public class Subsets {
    public static void main(String[] args) {
        TreeSet<Integer>s1=new TreeSet<Integer>();
        TreeSet<Integer>s2=new TreeSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        System.out.println(s2.containsAll(s1)||s1.containsAll(s2));
    }
}
