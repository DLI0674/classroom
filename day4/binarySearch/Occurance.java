package classroom.day4.binarySearch;

public class Occurance {
    static int firstOccurance(int[] arr,int x){
        int l=0,r= arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(arr[l]==x)return l;
        return -1;
    }
    static int lastOccurance(int[] arr,int x){
        int l=0,r= arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(arr[r]==x)return r;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,4,6,9,11,15,16,17,19};
        System.out.println(firstOccurance(arr,1));
        System.out.println(lastOccurance(arr,1));
    }
}
