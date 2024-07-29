package classroom.day4.binarySearch;

import static classroom.day4.binarySearch.SortedArray.binarySearch;

public class Position {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,9,11,15,16,17,19};
        System.out.println(binarySearch(arr,11)+1);
    }
}
