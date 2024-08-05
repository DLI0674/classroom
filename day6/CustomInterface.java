package classroom.day6;

interface Custom{
    int square(int num);
    default void display(int num){
        int res=square(num);
        System.out.println("Result: "+res);
    }
}
public class CustomInterface {
    public static void main(String[] args) {
        Custom sq=(num)->num*num;
        sq.display(5);
    }
}
