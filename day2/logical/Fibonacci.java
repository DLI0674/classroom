package classroom.day2.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int t;
        while(a+b<=n){
            t=a+b;
            System.out.println(t);
            a=b;
            b=t;
        }
    }
}