package classroom.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PerformanceComparison {
    public static void main(String[] args) {
        HashSet<Integer>s1=new HashSet<Integer>();
        LinkedHashSet<Integer>s2=new LinkedHashSet<Integer>();
        TreeSet<Integer>s3=new TreeSet<Integer>();
        long a1=System.nanoTime();
        for(int i=0;i<1000000;i++){
            s1.add(i);
        }
        Iterator<Integer>x1=s1.iterator();
        while(x1.hasNext()){
            System.out.print(x1.next()+" ");
        }
        long a2=System.nanoTime();
        for(int i=0;i<1000000;i++){
            s2.add(i);
        }
        Iterator<Integer>x2=s2.iterator();
        while(x2.hasNext()){
            System.out.print(x2.next()+" ");
        }
        long a3=System.nanoTime();
        for(int i=0;i<1000000;i++){
            s3.add(i);
        }
        Iterator<Integer>x3=s3.iterator();
        while(x3.hasNext()){
            System.out.print(x3.next()+" ");
        }
        long a4=System.nanoTime();
        System.out.println("Time for Hashset: "+(a2-a1));
        System.out.println("Time for Linkedhashset: "+(a3-a2));
        System.out.println("Time for Treeset: "+(a4-a3));
    }
}
