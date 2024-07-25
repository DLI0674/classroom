package classroom.day2.array;

public class Reversal {
    static int[] rev(int n,int[] arr){
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[n-i-1]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] a=rev(5,arr);
        for(int i=0;i<5;i++){
            System.out.println(a[i]); 
        }
    }
}
