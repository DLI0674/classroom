package classroom.day1;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=0,t=0;
        for(int i=0;i<n;i++){
            double rand=Math.random();
            if(rand<.5){
                t++;
            }
            else{
                h++;
            }
        }
        System.out.println((100*h)/(h+t));
        System.out.println((100*t)/(h+t));
    }
}
