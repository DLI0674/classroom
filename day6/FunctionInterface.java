package classroom.day6;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer,Double>area=r->(1.0*(22/7)*r*r);
        System.out.println(area.apply(14));
    }
}
