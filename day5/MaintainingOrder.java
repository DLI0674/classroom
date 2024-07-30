package classroom.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MaintainingOrder {
    static LinkedHashSet<String> linkedHashSet(ArrayList<String>arr){
        LinkedHashSet<String>st=new LinkedHashSet<String>();
        Iterator<String>s=arr.iterator();
        while(s.hasNext()){
            st.add(s.next());
        }
        return st;
    }
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            String s=sc.nextLine();
            arr.add(s);
        }
        System.out.println(linkedHashSet(arr));
    }
}
