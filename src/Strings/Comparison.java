package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Poorna";
        String b = "Poorna";


        // ==
        // By using == it compares the object
        System.out.println("Using == we will get ->" + (a == b));
        System.out.println("Using .equals we will get ->" + a.equals(b));


        //By using .equals it compares only value but not the object
        String x = new String("chandra");
        String y = new String("chandra");
        System.out.println("Using == we will get ->" + (x == y));
        System.out.println("Using .equals we will get ->" + x.equals(y));


    }
}
