package Patterns.InOrder;

public class Pattern12 {
    public static void main(String[] args) {
        p12(3);
    }

    static void p12(int n){
        for (int row = 1; row <= 2*n; row++) {

            int noOfCol  = row > n ? row-n : (n+1) - row ;

            int space = n - noOfCol;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= noOfCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
