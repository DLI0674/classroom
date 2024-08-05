package classroom.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("AMAN","ANAND","MRIDUL","TIWARI","ASHISH","AYUSH");
        List<String>ans=list.stream().filter(s->s.contains("A")).collect(Collectors.toList());
        System.out.println(ans);
    }
}
