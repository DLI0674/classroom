package classroom.day4.binarySearch;

public class SortedArray {
    static int binarySearch(int[] arr,int x){
        int l=0,r= arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,6,9,11,15,16,17,19};
        System.out.println(binarySearch(arr,4));
    }
}
