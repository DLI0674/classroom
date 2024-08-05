package classroom.day10.multithreading.problem1;

public class Problem1 {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4}};
        int[][] arr2={{1,2},{3,4}};
        int[][] ans=new int[2][2];
        Multiply t1=new Multiply(arr1,arr2,0,0);
        t1.start();
        Multiply t2=new Multiply(arr1,arr2,0,1);
        t2.start();
        Multiply t3=new Multiply(arr1,arr2,1,0);
        t3.start();
        Multiply t4=new Multiply(arr1,arr2,1,1);
        t4.start();
        for(int i = 0; i< Multiply.ans.length; i++){
            for(int j = 0; j< Multiply.ans[0].length; j++){
                System.out.print(Multiply.ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
