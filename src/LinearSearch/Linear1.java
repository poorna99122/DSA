package LinearSearch;

//Find whether 14 exists in array or not ?   [ 18,12,9,14,77,50 ]
public class Linear1 {
    public static void main(String[] args) {
        int[] nums = {25,45,21,35,65,24,85,6,5,-1,-9};
        int target = 855;
        int ans = linerSearch(nums,target);
        System.out.println("Target element index is: "+ ans);
    }

    //search in the array : return the index if item found
    //Otherwise if item not found return 1

    static int linerSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = 0; index< arr.length;index++){
            // check for every element at every index if it is == target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //This line will execute if none of the return statement hits
        //hence the target not found

      return -1;
    }

}
