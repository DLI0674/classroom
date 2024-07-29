package classroom.day4.binarySearch;

public class SmallestAndLargest {
    static int smallest(int[] arr,int x){
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
        return l;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,6,9,11,15,16,17,19};
        int idx=smallest(arr,2);
        if(idx>= arr.length){
            System.out.println("Element does not exists.");
        }
        else{
            System.out.println(arr[idx]);
            System.out.println(arr[arr.length-1]);
        }
    }
}
