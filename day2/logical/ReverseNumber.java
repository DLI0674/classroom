package classroom.day2.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        while(n>0){
            t=t*10+(n%10);
            n/=10;
        }
        System.out.println(t);
    }
}
