import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Print first number:");
        int num1 = in.nextInt();
        System.out.println("Print second number:");
        int num2 = in.nextInt();
        System.out.println("Print third number:");
        int num3 = in.nextInt();


        int max = num1;
        if (num2>max){
            max = num2;
            System.out.println("Largest is: "+max);
        }
        if (num3>max){
            max = num3;
            System.out.println("Largest is: "+max);
        }


    }
}
