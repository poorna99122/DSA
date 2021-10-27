package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //In Arrays they are fixed in size
        // When we dont know or dont want to give particular size and let Java give the size
        //We can give any number of elements we can by array List we can achive this
        // ArrayList is a class from Collection framework
        //Syntax
        ArrayList <Integer> list = new ArrayList<>(10);


//        list.add(47);
//        list.add(477);
//        list.add(487);
//        list.add(457);
//        list.add(427);
//        list.add(147);
//        list.add(476);
//
//
//        //To print the list
//        System.out.println(list);
//        //To check whether element is present in that list or not
//        System.out.println(list.contains(99));
//        //To check the size of the list
//        System.out.println(list.size());
//        //To set the element (to replace)
//        list.set(0,98);
//        System.out.println(list);
//        //To remove index 2
//        list.remove(2);
//        System.out.println(list);




        //Iterating Inputing
        for (int i = 0;i<5;i++){
            list.add(in.nextInt());

        }
        //get item at any index
        for (int i = 0;i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);





    }
}
