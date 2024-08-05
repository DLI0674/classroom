package classroom.day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=0;
        try {
            int n=sc.nextInt();
            res=100/n;
        }catch (InputMismatchException e){
            e.printStackTrace();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
