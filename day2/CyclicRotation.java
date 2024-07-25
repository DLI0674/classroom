package classroom.day2;

import java.util.Scanner;

public class CyclicRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        for(int i=n-r%n;i<2*n-(r%n);i++){
            System.out.println(arr[i%n]);
        }
    }
}
