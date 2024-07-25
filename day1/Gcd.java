package classroom.day1;

import java.util.Scanner;

public class Gcd {
    public static int fn(int a,int b){
        if(a%b==0){
            return b;
        }
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        return fn(a%b,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(fn(a,b));
    }
}
