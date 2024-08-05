package classroom.day10.multithreading.problem1;

public class Multiply extends Thread{
    static int[][] ans=new int[2][2];
    int[][] a1;
    int[][] a2;
    int i=0;
    int j=0;

    public Multiply(int[][] arr1,int[][] arr2,int x,int y){
        this.a1=arr1;
        this.a2=arr2;
        this.i=x;
        this.j=y;
    }
    public synchronized void run(){
        ans[i][j]=0;
        for(int k=0;k<a1.length;k++){
            ans[i][j]+=a1[i][k]*a2[k][j];
        }
    }
}
