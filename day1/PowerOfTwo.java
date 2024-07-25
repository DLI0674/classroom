package classroom.day1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<Math.min(n,32);i++){
            System.out.println(1L<<i);
        }
    }
}
