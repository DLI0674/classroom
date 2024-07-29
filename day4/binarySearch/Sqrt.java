package classroom.day4.binarySearch;

import java.util.Scanner;

public class Sqrt {
    static int squareRoot(int x){
        int l=0,h=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid<x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(squareRoot(n));
    }
}
