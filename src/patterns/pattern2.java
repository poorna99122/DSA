package patterns;

public class pattern2 {
    public static void main(String[] args) {
        x(5);
    }

    static void x(int n){
        for (int row=1;row<=n;row++){
            //for every row, run the col
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
