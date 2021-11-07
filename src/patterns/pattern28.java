package patterns;

public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static  void pattern(int n){
        for(int row =0;row<2*n;row++){
            int totalColInRow = row > n ? 2*n - row: row;
            int noOfSpaces = n-totalColInRow;
            for(int spaces = 0; spaces< noOfSpaces; spaces++){
                System.out.print(" ");
            }
            for(int col =0; col< totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
