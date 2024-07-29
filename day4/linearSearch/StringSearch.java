package classroom.day4.linearSearch;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        String c=sc.nextLine();
        int sz=c.length();
        for(int i=0;i<p.length()-sz+1;i++){
            if(c.equals(p.substring(i,i+sz))){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
