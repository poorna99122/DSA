package LinearSearch;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Maximum element is :");
        System.out.println(max(arr));
        System.out.println("Minimum element is :");
        System.out.println(min(arr));
    }

    //To find target element in 2D array
     static int[] search(int[][] arr, int target) {
         for(int row =0; row< arr.length;row++){
             for(int col =0; col< arr[row].length;col++){
                 if(arr[row][col] == target){
                     return new int[]{row, col};
                 }
             }
         }
         return new int[]{-1, -1};
    }


    //To find maximum element in a 2D array
    static int max(int[][] arr) {

        int maxi = Integer.MIN_VALUE;

        for(int row =0; row< arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
               if(arr[row][col] > maxi){
                   maxi = arr[row][col];
               }
            }
        }
        return maxi;
    }




    //To find minimum value in a 2D array
    static int min(int[][] arr) {

        int mini = Integer.MAX_VALUE;

        for(int row =0; row< arr.length;row++){
            for(int col =0; col< arr[row].length;col++){
                if(arr[row][col] < mini){
                    mini = arr[row][col];
                }
            }
        }
        return mini;
    }
}
