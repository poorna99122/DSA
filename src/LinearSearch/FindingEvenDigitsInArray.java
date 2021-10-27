package LinearSearch;

import java.io.OptionalDataException;

public class FindingEvenDigitsInArray {
    public static void main(String[] args) {

        int[] arr = {12,345,2,6,7896};
        //To find num of even digit numbers in an array
        System.out.println(findNumbers(arr));


    }



static int findNumbers(int[] nums) {
        int count = 0;
    for (int i = 0; i<nums.length ; i++){
            if (findEven(nums[i])){
                count++;
            }
        }
        return count;
    }


    //Finding even or not
    static boolean findEven(int num1) {
        int noOfDigits = digits(num1);
//        if(noOfDigits % 2 == 0){
//            return true;
//        }
//
//       return false;
        return noOfDigits % 2 == 0;
    }


    //Finding no of digits in bruteForce
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num ==  0){
            return 1;
        }




        int count = 0;
        //Counting no of digits
        while(num > 0){
            count ++;
            num=num/10;
        }

        return count;
    }



    //Finding no of digits in optimised
    static int digits2(int num){

        if(num < 0){
            num = num * -1;
        }

        return (int)(Math.log10(num)) +1 ;



    }
}


