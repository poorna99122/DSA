package BinarySearch;

//Here in this we are going to check whether the given array is ascending sorted or descending sorted
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,10,15,21,42,56,62,75,99};
        int[] arr1 = {99,75,62,56,42,21,15,10,5,4,3,2};

        System.out.println( orderAgnosticBinarysearch(arr,56));
    }

    static int orderAgnosticBinarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;


        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];





        while(start <= end){
            //find middle element
            //int mid = (start+end)/2;   //there might be possinle that (start+end) exceeds the range of int in java
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else if (target> arr[mid]){
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else if (target < arr[mid]){
                    start = mid + 1;
                }
            }


        }

        return -1;
    }
}
