package BinarySearch;

public class BinarySearchImplimentation {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,10,15,21,42,56,62,75,99};
        System.out.println( binarySearch(arr,56));

    }


    //return index
    //return -1 if doesn't exists
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            //find middle element
           //int mid = (start+end)/2;   //there might be possinle that (start+end) exceeds the range of int in java
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if (target> arr[mid]){
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }

        return -1;
    }
}
