package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {


        // arr = [18,12,-7,3,14,28]
        //Search for 3 in the range of index [1,4]
        int[] arr = {18,12,-7,3,14,28};
        int target  = 18;
        System.out.println(linerSearch(arr,target,1,4));



    }

    static int linerSearch(int[] arr , int target , int start , int end){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = start; index< end;index++){
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
