package classroom.day5;

import java.util.*;

public class ClassSpecificSetBehaviour {
    static HashSet<Integer> hashSet(ArrayList<Integer> arr){
        HashSet<Integer> st=new HashSet<Integer>();
        Iterator<Integer>x= arr.iterator();
        while(x.hasNext()){
            st.add(x.next());
        }
        return st;
    }
    static Set<Integer> linkedHashSet(ArrayList<Integer>arr){
        LinkedHashSet<Integer> st=new LinkedHashSet<Integer>();
        Iterator<Integer> x=arr.iterator();
        while(x.hasNext()){
            st.add(x.next());
        }
        return st;
    }
    static TreeSet<Integer> treeSet(ArrayList<Integer>arr){
        TreeSet<Integer>st=new TreeSet<Integer>();
        Iterator<Integer>x=arr.iterator();
        while(x.hasNext()){
            st.add(x.next());
        }
        return st;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            arr.add((int)(1+Math.random()*(10-1)));
        }
        System.out.println(arr);
        System.out.println(hashSet(arr));
        System.out.println(linkedHashSet(arr));
        System.out.println(treeSet(arr));
    }
}
