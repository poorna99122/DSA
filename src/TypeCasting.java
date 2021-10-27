import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //Here when one type of data is assigning to another type of variable and Automatic typeConversion takes place if
        //following conditions are met

        //Here destionation type should be greater than source type
        // so here when we give Integer as input it converts to float and delivers output as float
        // this is because Float is greater than Integer
//        Scanner in = new Scanner(System.in);
//        float num = in.nextFloat();
//
//
//        System.out.println(num);


        //Then how can we convert float to Integer ?
        // How can we assign a float value to an integer variable
        //This is sometimes called as narrowing conversion

        //int num = 74.5f;  // Here this gives error
//        int num1 = (int)74.5f;
//        System.out.println(num1);


        //automatic type promotions in expressions
//        int a = 257;
//        byte b = (byte)a;  //257%256 = 1
//        System.out.println(b);   // here we are getting output is 1

        // here when we try to put bigger value to it's original range then output is 257%256 = 1


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/c ;   // although byte can store upto 256 here java internally promoting
        // (a*b) expression to Integer as it is allotted to Integer


        System.out.println("नमस्ते");




    }
}
