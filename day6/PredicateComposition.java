package classroom.day6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Mridul","Tiwari","Aman","Ayush","Kumar","Pranit");
        Predicate<String>contains=s->s.length()>5&&s.contains("a");
        List<String>ans=list.stream().filter(s->contains.test(s)).collect(Collectors.toList());
        System.out.println(ans);
    }
}