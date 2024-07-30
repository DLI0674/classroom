package classroom.day5;

import java.util.*;

public class SortedUnique {
    static TreeSet<Integer> sortedUnique(ArrayList<Integer> arr){
        TreeSet<Integer>st=new TreeSet<Integer>();
        Iterator<Integer> s=arr.iterator();
        while(s.hasNext()){
            st.add(s.next());
        }
        return st;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            int s=sc.nextInt();
            arr.add(s);
        }
        System.out.println(sortedUnique(arr));
    }
}
