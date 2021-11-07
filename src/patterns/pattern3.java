package patterns;

public class pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row =n ;row>=1;row--){
            for (int col =row ;col>=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
