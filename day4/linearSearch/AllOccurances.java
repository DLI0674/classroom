package classroom.day4.linearSearch;

import java.util.ArrayList;

public class AllOccurances {
    static ArrayList<Integer> count(int[] arr,int x){
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,6,5,4,2,3,5,1,3,5,7,8,9,9,6,5,3,4,5,6,9,0};
        ArrayList<Integer>ans=count(arr,9);
        System.out.println(ans);
    }
}
