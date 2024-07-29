package classroom.day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Intersaction {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<Integer>();
        ArrayList<Integer>b=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            a.add((int)(Math.random()*(100-0)));
            System.out.print(a.get(i));
            System.out.print(" ");
        }
        System.out.println(" ");
        for(int i=0;i<100;i++){
            b.add((int)(Math.random()*(100-0)));
            System.out.print(a.get(i));
            System.out.print(" ");
        }
        System.out.println(" ");
        Collections.sort(a);
        Collections.sort(b);
        int i=0,j=0;
        while(i<a.size()&&j<b.size()){
            if(a.get(i)==b.get(j)){
                System.out.println(a.get(i));
                i++;
                j++;
            }
            else if(a.get(i)<b.get(j)){
                i++;
            }
            else{
                j++;
            }
        }
    }
}
