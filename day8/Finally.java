package classroom.day8;

public class Finally {
    public static void main(String[] args) {
        int n=0;
        try{
            int res=100/n;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Program completed successfully.");
        }
    }
}