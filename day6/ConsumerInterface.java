package classroom.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mridul","Tiwari");
        //list.stream().forEach(s-> System.out.println(s.toUpperCase()));
        list.forEach(s-> System.out.println(s.toUpperCase()));
    }
}
