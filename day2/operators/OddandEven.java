package classroom.day2.operators;

import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
