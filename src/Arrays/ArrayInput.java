package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 44;
//        arr[2] = 77;
//        arr[3] = 99;
//        arr[4] = 88;
//        System.out.println(arr[3]);

        //input using for loop
//        for (int i= 0;i< arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//
//
//        System.out.println(Arrays.toString(arr));

//        for (int i= 0;i< arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }




        //for each
//       for(int num : arr){
//            System.out.print(num+ " "); // here num represents element of the array
//        }

//        System.out.println(arr[5]);  //Index out of bound error


        //Array of Objects
        System.out.println("Give the inputs");
        String [] str = new String[4];
        for (int i = 0;i< str.length;i++){
           str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));





    }
}
