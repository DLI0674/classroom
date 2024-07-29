package classroom.day4.arrayList;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            arr.add((int)(Math.random()*(100-0)));
        }
        int i=0,j= arr.size()-1;
        while(i<=j){
            if(arr.get(i)==arr.get(j)){
                i++;
                j++;
            }
            else{
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
