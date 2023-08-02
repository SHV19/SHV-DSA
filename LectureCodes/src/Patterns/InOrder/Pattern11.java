package Patterns.InOrder;

public class Pattern11 {
    public static void main(String[] args) {
        p11(5);
    }

    static void p11(int n){
        for (int row = 0; row < n; row++) {
            int space = n-row;
            for (int s = 0; s < row ; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n - row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
