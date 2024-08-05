package classroom.day6;

import java.util.stream.Stream;

public class BifunctionInterface {
    private static String fn(String a,String b){
        return a+" "+b;
    }
    public static void main(String[] args) {
        String res= Stream.of("Mridul","Tiwari").reduce("",(a,b)->fn(a,b));
        System.out.println(res);
    }
}
