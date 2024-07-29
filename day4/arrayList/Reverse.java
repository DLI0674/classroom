package classroom.day4.arrayList;

import java.util.ArrayList;

public class Reverse {
    static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=arr.size()-1;i>=0;i--){
            a.add(arr.get(i));
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*(100-0)));
        }
        System.out.println(arr);
        arr=reverse(arr);
        System.out.println(arr);
    }
}
