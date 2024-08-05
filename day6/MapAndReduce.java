package classroom.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndReduce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer>ans=list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(ans);
    }
}