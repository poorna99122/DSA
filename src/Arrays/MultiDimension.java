package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9},
//
//        };

//        System.out.println(arr[1].length);

        int[][] arr = new int[3][3];

        //Giving inputs to array
        for (int row = 0; row< arr.length; row++){
            for (int col = 0;col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }


        //Output
//        for (int row = 0; row< arr.length; row++){
//            for (int col = 0;col< arr[row].length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }


//             Getting output of the array using normal for loop and toString method
//            for (int row = 0; row < arr.length; row++) {
//                System.out.println(Arrays.toString(arr[row]));
//            }


//             Getting output of the array using enhanced for loop and toString method
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
            }








    }
}
