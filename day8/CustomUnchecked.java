package classroom.day8;

public class CustomUnchecked {
    public static void main(String[] args) {
        int n=0;
        try{
            int res=100/n;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
