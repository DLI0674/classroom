package classroom.day2.logical;

import java.util.Arrays;
import java.util.Scanner;

public class CoupanNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[100000];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            int idx=sc.nextInt();
            arr[idx]=1;
        }
        int ct=0;
        while(n>0){
            int rand=(int)(Math.random()*100000);
            if(arr[rand]==1){
                n--;
            }
            ct++;
        }
        System.out.println(ct);
    }
}
