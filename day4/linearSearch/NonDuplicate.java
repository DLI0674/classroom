package classroom.day4.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicate {
    static char duplicate(String s){
        int[] ct= new int[26];
        Arrays.fill(ct,0);
        for(int i=0;i<s.length();i++){
            ct[(int)(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<s.length();i++){
            if(ct[(int)(s.charAt(i)-'a')]==1){
                return s.charAt(i);
            }
        }
        return s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(duplicate(s));
    }
}
