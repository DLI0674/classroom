package classroom.day2.array;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            mn=Math.min(mn,arr[i]);
        }
        System.out.println(mx);
        System.out.println(mn);
    }
}
