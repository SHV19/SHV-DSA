package Patterns.InOrder;

public class Pattern9 {
    public static void main(String[] args) {
        p9(5);
    }
    static void p9(int n){
        for (int row = 0; row < n; row++) {

            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*(n-row) - 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
