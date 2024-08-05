package classroom.day8;

import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        try {
            res=100/n;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
