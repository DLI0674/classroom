package classroom.day4.linearSearch;

public class Maximum {
    public static void main(String[] args) {
        int[] arr ={1,2,9,5,7,8,5,3,7,7,3,5,8,9};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            mx=Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
